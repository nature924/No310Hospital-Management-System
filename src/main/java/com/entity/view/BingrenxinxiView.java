package com.entity.view;

import com.entity.BingrenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 病人信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
@TableName("bingrenxinxi")
public class BingrenxinxiView  extends BingrenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BingrenxinxiView(){
	}
 
 	public BingrenxinxiView(BingrenxinxiEntity bingrenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, bingrenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
