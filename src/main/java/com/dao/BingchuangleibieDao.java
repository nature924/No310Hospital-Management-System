package com.dao;

import com.entity.BingchuangleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingchuangleibieVO;
import com.entity.view.BingchuangleibieView;


/**
 * 病床类别
 * 
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface BingchuangleibieDao extends BaseMapper<BingchuangleibieEntity> {
	
	List<BingchuangleibieVO> selectListVO(@Param("ew") Wrapper<BingchuangleibieEntity> wrapper);
	
	BingchuangleibieVO selectVO(@Param("ew") Wrapper<BingchuangleibieEntity> wrapper);
	
	List<BingchuangleibieView> selectListView(@Param("ew") Wrapper<BingchuangleibieEntity> wrapper);

	List<BingchuangleibieView> selectListView(Pagination page,@Param("ew") Wrapper<BingchuangleibieEntity> wrapper);
	
	BingchuangleibieView selectView(@Param("ew") Wrapper<BingchuangleibieEntity> wrapper);
	
}
