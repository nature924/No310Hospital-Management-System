package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病床
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
@TableName("bingchuang")
public class BingchuangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BingchuangEntity() {
		
	}
	
	public BingchuangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 所属科室
	 */
					
	private String suoshukeshi;
	
	/**
	 * 病床类型
	 */
					
	private String bingchuangleixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 病床号
	 */
					
	private String bingchuanghao;
	
	/**
	 * 使用状态
	 */
					
	private String shiyongzhuangtai;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：所属科室
	 */
	public void setSuoshukeshi(String suoshukeshi) {
		this.suoshukeshi = suoshukeshi;
	}
	/**
	 * 获取：所属科室
	 */
	public String getSuoshukeshi() {
		return suoshukeshi;
	}
	/**
	 * 设置：病床类型
	 */
	public void setBingchuangleixing(String bingchuangleixing) {
		this.bingchuangleixing = bingchuangleixing;
	}
	/**
	 * 获取：病床类型
	 */
	public String getBingchuangleixing() {
		return bingchuangleixing;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：病床号
	 */
	public void setBingchuanghao(String bingchuanghao) {
		this.bingchuanghao = bingchuanghao;
	}
	/**
	 * 获取：病床号
	 */
	public String getBingchuanghao() {
		return bingchuanghao;
	}
	/**
	 * 设置：使用状态
	 */
	public void setShiyongzhuangtai(String shiyongzhuangtai) {
		this.shiyongzhuangtai = shiyongzhuangtai;
	}
	/**
	 * 获取：使用状态
	 */
	public String getShiyongzhuangtai() {
		return shiyongzhuangtai;
	}

}
