package com.lquan.atImprot.improts;/**
 * Created by 01370602 on 2020/4/27.
 */

import com.lquan.atImprot.dao.IndexDao3;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ClassName MyImportSelector
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class MyImportSelector implements ImportSelector {
	/**
	 * Select and return the names of which class(es) should be imported based on
	 * the {@link AnnotationMetadata} of the importing @{@link //Configuration} class.
	 *
	 * @param importingClassMetadata
	 * @return the class names, or an empty array if none
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		String name  = IndexDao3.class.getName();
		System.out.println(name);

		return new String[]{name};
	}








































}
