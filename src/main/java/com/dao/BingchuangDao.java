package com.dao;

import com.entity.BingchuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingchuangVO;
import com.entity.view.BingchuangView;


/**
 * 病床
 * 
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface BingchuangDao extends BaseMapper<BingchuangEntity> {
	
	List<BingchuangVO> selectListVO(@Param("ew") Wrapper<BingchuangEntity> wrapper);
	
	BingchuangVO selectVO(@Param("ew") Wrapper<BingchuangEntity> wrapper);
	
	List<BingchuangView> selectListView(@Param("ew") Wrapper<BingchuangEntity> wrapper);

	List<BingchuangView> selectListView(Pagination page,@Param("ew") Wrapper<BingchuangEntity> wrapper);
	
	BingchuangView selectView(@Param("ew") Wrapper<BingchuangEntity> wrapper);
	
}
