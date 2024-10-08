package com.entity.view;

import com.entity.DiscussjiankangjiangtanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康讲坛评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
@TableName("discussjiankangjiangtan")
public class DiscussjiankangjiangtanView  extends DiscussjiankangjiangtanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiankangjiangtanView(){
	}
 
 	public DiscussjiankangjiangtanView(DiscussjiankangjiangtanEntity discussjiankangjiangtanEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiankangjiangtanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
