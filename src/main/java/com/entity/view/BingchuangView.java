package com.entity.view;

import com.entity.BingchuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 病床
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
@TableName("bingchuang")
public class BingchuangView  extends BingchuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BingchuangView(){
	}
 
 	public BingchuangView(BingchuangEntity bingchuangEntity){
 	try {
			BeanUtils.copyProperties(this, bingchuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
