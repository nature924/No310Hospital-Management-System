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
 * 药房
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
@TableName("yaofang")
public class YaofangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaofangEntity() {
		
	}
	
	public YaofangEntity(T t) {
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
	 * 药品编号
	 */
					
	private String yaopinbianhao;
	
	/**
	 * 药品名称
	 */
					
	private String yaopinmingcheng;
	
	/**
	 * 英文名称
	 */
					
	private String yingwenmingcheng;
	
	/**
	 * 剂型
	 */
					
	private String jixing;
	
	/**
	 * 药品类别
	 */
					
	private String yaopinleibie;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 生产日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengchanriqi;
	
	/**
	 * 厂商名称
	 */
					
	private String changshangmingcheng;
	
	/**
	 * 厂商地址
	 */
					
	private String changshangdizhi;
	
	/**
	 * 药品图片
	 */
					
	private String yaopintupian;
	
	/**
	 * 药品价格
	 */
					
	private Integer yaopinjiage;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 计量单位
	 */
					
	private String jiliangdanwei;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	
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
	 * 设置：药品编号
	 */
	public void setYaopinbianhao(String yaopinbianhao) {
		this.yaopinbianhao = yaopinbianhao;
	}
	/**
	 * 获取：药品编号
	 */
	public String getYaopinbianhao() {
		return yaopinbianhao;
	}
	/**
	 * 设置：药品名称
	 */
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
	/**
	 * 设置：英文名称
	 */
	public void setYingwenmingcheng(String yingwenmingcheng) {
		this.yingwenmingcheng = yingwenmingcheng;
	}
	/**
	 * 获取：英文名称
	 */
	public String getYingwenmingcheng() {
		return yingwenmingcheng;
	}
	/**
	 * 设置：剂型
	 */
	public void setJixing(String jixing) {
		this.jixing = jixing;
	}
	/**
	 * 获取：剂型
	 */
	public String getJixing() {
		return jixing;
	}
	/**
	 * 设置：药品类别
	 */
	public void setYaopinleibie(String yaopinleibie) {
		this.yaopinleibie = yaopinleibie;
	}
	/**
	 * 获取：药品类别
	 */
	public String getYaopinleibie() {
		return yaopinleibie;
	}
	/**
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
	/**
	 * 设置：生产日期
	 */
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
	/**
	 * 设置：厂商名称
	 */
	public void setChangshangmingcheng(String changshangmingcheng) {
		this.changshangmingcheng = changshangmingcheng;
	}
	/**
	 * 获取：厂商名称
	 */
	public String getChangshangmingcheng() {
		return changshangmingcheng;
	}
	/**
	 * 设置：厂商地址
	 */
	public void setChangshangdizhi(String changshangdizhi) {
		this.changshangdizhi = changshangdizhi;
	}
	/**
	 * 获取：厂商地址
	 */
	public String getChangshangdizhi() {
		return changshangdizhi;
	}
	/**
	 * 设置：药品图片
	 */
	public void setYaopintupian(String yaopintupian) {
		this.yaopintupian = yaopintupian;
	}
	/**
	 * 获取：药品图片
	 */
	public String getYaopintupian() {
		return yaopintupian;
	}
	/**
	 * 设置：药品价格
	 */
	public void setYaopinjiage(Integer yaopinjiage) {
		this.yaopinjiage = yaopinjiage;
	}
	/**
	 * 获取：药品价格
	 */
	public Integer getYaopinjiage() {
		return yaopinjiage;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：计量单位
	 */
	public void setJiliangdanwei(String jiliangdanwei) {
		this.jiliangdanwei = jiliangdanwei;
	}
	/**
	 * 获取：计量单位
	 */
	public String getJiliangdanwei() {
		return jiliangdanwei;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}

}
