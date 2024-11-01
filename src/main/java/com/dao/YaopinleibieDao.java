package com.dao;

import com.entity.YaopinleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinleibieVO;
import com.entity.view.YaopinleibieView;


/**
 * 药品类别
 * 
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface YaopinleibieDao extends BaseMapper<YaopinleibieEntity> {
	
	List<YaopinleibieVO> selectListVO(@Param("ew") Wrapper<YaopinleibieEntity> wrapper);
	
	YaopinleibieVO selectVO(@Param("ew") Wrapper<YaopinleibieEntity> wrapper);
	
	List<YaopinleibieView> selectListView(@Param("ew") Wrapper<YaopinleibieEntity> wrapper);

	List<YaopinleibieView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinleibieEntity> wrapper);
	
	YaopinleibieView selectView(@Param("ew") Wrapper<YaopinleibieEntity> wrapper);
	
}
