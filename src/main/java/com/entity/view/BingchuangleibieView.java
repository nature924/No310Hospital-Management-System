package com.entity.view;

import com.entity.BingchuangleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 病床类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
@TableName("bingchuangleibie")
public class BingchuangleibieView  extends BingchuangleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BingchuangleibieView(){
	}
 
 	public BingchuangleibieView(BingchuangleibieEntity bingchuangleibieEntity){
 	try {
			BeanUtils.copyProperties(this, bingchuangleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
