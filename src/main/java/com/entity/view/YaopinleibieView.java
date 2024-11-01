package com.entity.view;

import com.entity.YaopinleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药品类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
@TableName("yaopinleibie")
public class YaopinleibieView  extends YaopinleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaopinleibieView(){
	}
 
 	public YaopinleibieView(YaopinleibieEntity yaopinleibieEntity){
 	try {
			BeanUtils.copyProperties(this, yaopinleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
