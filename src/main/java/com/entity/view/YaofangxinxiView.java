package com.entity.view;

import com.entity.YaofangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药方信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
@TableName("yaofangxinxi")
public class YaofangxinxiView  extends YaofangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaofangxinxiView(){
	}
 
 	public YaofangxinxiView(YaofangxinxiEntity yaofangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yaofangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
