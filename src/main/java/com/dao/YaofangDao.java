package com.dao;

import com.entity.YaofangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaofangVO;
import com.entity.view.YaofangView;


/**
 * 药房
 * 
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface YaofangDao extends BaseMapper<YaofangEntity> {
	
	List<YaofangVO> selectListVO(@Param("ew") Wrapper<YaofangEntity> wrapper);
	
	YaofangVO selectVO(@Param("ew") Wrapper<YaofangEntity> wrapper);
	
	List<YaofangView> selectListView(@Param("ew") Wrapper<YaofangEntity> wrapper);

	List<YaofangView> selectListView(Pagination page,@Param("ew") Wrapper<YaofangEntity> wrapper);
	
	YaofangView selectView(@Param("ew") Wrapper<YaofangEntity> wrapper);
	
}
