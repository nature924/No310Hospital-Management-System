package com.dao;

import com.entity.BingrenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingrenxinxiVO;
import com.entity.view.BingrenxinxiView;


/**
 * 病人信息
 * 
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface BingrenxinxiDao extends BaseMapper<BingrenxinxiEntity> {
	
	List<BingrenxinxiVO> selectListVO(@Param("ew") Wrapper<BingrenxinxiEntity> wrapper);
	
	BingrenxinxiVO selectVO(@Param("ew") Wrapper<BingrenxinxiEntity> wrapper);
	
	List<BingrenxinxiView> selectListView(@Param("ew") Wrapper<BingrenxinxiEntity> wrapper);

	List<BingrenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BingrenxinxiEntity> wrapper);
	
	BingrenxinxiView selectView(@Param("ew") Wrapper<BingrenxinxiEntity> wrapper);
	
}
