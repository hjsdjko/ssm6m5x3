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
 * 仪器设备
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
@TableName("yiqishebei")
public class YiqishebeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiqishebeiEntity() {
		
	}
	
	public YiqishebeiEntity(T t) {
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
	 * 设备编号
	 */
					
	private String shebeibianhao;
	
	/**
	 * 设备名称
	 */
					
	private String shebeimingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 设备类型
	 */
					
	private String shebeileixing;
	
	/**
	 * 用途
	 */
					
	private String yongtu;
	
	/**
	 * 生产商
	 */
					
	private String shengchanshang;
	
	/**
	 * 科室
	 */
					
	private String keshi;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 设备详情
	 */
					
	private String shebeixiangqing;
	
	
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
	 * 设置：设备编号
	 */
	public void setShebeibianhao(String shebeibianhao) {
		this.shebeibianhao = shebeibianhao;
	}
	/**
	 * 获取：设备编号
	 */
	public String getShebeibianhao() {
		return shebeibianhao;
	}
	/**
	 * 设置：设备名称
	 */
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
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
	 * 设置：设备类型
	 */
	public void setShebeileixing(String shebeileixing) {
		this.shebeileixing = shebeileixing;
	}
	/**
	 * 获取：设备类型
	 */
	public String getShebeileixing() {
		return shebeileixing;
	}
	/**
	 * 设置：用途
	 */
	public void setYongtu(String yongtu) {
		this.yongtu = yongtu;
	}
	/**
	 * 获取：用途
	 */
	public String getYongtu() {
		return yongtu;
	}
	/**
	 * 设置：生产商
	 */
	public void setShengchanshang(String shengchanshang) {
		this.shengchanshang = shengchanshang;
	}
	/**
	 * 获取：生产商
	 */
	public String getShengchanshang() {
		return shengchanshang;
	}
	/**
	 * 设置：科室
	 */
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：设备详情
	 */
	public void setShebeixiangqing(String shebeixiangqing) {
		this.shebeixiangqing = shebeixiangqing;
	}
	/**
	 * 获取：设备详情
	 */
	public String getShebeixiangqing() {
		return shebeixiangqing;
	}

}
