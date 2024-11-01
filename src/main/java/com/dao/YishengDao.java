package com.dao;

import com.entity.YishengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishengVO;
import com.entity.view.YishengView;


/**
 * 医生
 * 
 * @author 
 * @email 
 * @date 2021-04-15 15:10:23
 */
public interface YishengDao extends BaseMapper<YishengEntity> {
	
	List<YishengVO> selectListVO(@Param("ew") Wrapper<YishengEntity> wrapper);
	
	YishengVO selectVO(@Param("ew") Wrapper<YishengEntity> wrapper);
	
	List<YishengView> selectListView(@Param("ew") Wrapper<YishengEntity> wrapper);

	List<YishengView> selectListView(Pagination page,@Param("ew") Wrapper<YishengEntity> wrapper);
	
	YishengView selectView(@Param("ew") Wrapper<YishengEntity> wrapper);
	
}
