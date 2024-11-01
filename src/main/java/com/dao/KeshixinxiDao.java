package com.dao;

import com.entity.KeshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeshixinxiVO;
import com.entity.view.KeshixinxiView;


/**
 * 科室信息
 * 
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface KeshixinxiDao extends BaseMapper<KeshixinxiEntity> {
	
	List<KeshixinxiVO> selectListVO(@Param("ew") Wrapper<KeshixinxiEntity> wrapper);
	
	KeshixinxiVO selectVO(@Param("ew") Wrapper<KeshixinxiEntity> wrapper);
	
	List<KeshixinxiView> selectListView(@Param("ew") Wrapper<KeshixinxiEntity> wrapper);

	List<KeshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KeshixinxiEntity> wrapper);
	
	KeshixinxiView selectView(@Param("ew") Wrapper<KeshixinxiEntity> wrapper);
	
}
