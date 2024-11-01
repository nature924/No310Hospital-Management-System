package com.entity.view;

import com.entity.YaofangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药房
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
@TableName("yaofang")
public class YaofangView  extends YaofangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaofangView(){
	}
 
 	public YaofangView(YaofangEntity yaofangEntity){
 	try {
			BeanUtils.copyProperties(this, yaofangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
