package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HushiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HushiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HushiView;


/**
 * 护士
 *
 * @author 
 * @email 
 * @date 2021-04-15 15:10:23
 */
public interface HushiService extends IService<HushiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HushiVO> selectListVO(Wrapper<HushiEntity> wrapper);
   	
   	HushiVO selectVO(@Param("ew") Wrapper<HushiEntity> wrapper);
   	
   	List<HushiView> selectListView(Wrapper<HushiEntity> wrapper);
   	
   	HushiView selectView(@Param("ew") Wrapper<HushiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HushiEntity> wrapper);
   	
}

