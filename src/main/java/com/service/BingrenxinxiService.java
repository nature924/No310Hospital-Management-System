package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingrenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingrenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingrenxinxiView;


/**
 * 病人信息
 *
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface BingrenxinxiService extends IService<BingrenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingrenxinxiVO> selectListVO(Wrapper<BingrenxinxiEntity> wrapper);
   	
   	BingrenxinxiVO selectVO(@Param("ew") Wrapper<BingrenxinxiEntity> wrapper);
   	
   	List<BingrenxinxiView> selectListView(Wrapper<BingrenxinxiEntity> wrapper);
   	
   	BingrenxinxiView selectView(@Param("ew") Wrapper<BingrenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingrenxinxiEntity> wrapper);
   	
}

