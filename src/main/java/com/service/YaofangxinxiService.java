package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaofangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaofangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaofangxinxiView;


/**
 * 药方信息
 *
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface YaofangxinxiService extends IService<YaofangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaofangxinxiVO> selectListVO(Wrapper<YaofangxinxiEntity> wrapper);
   	
   	YaofangxinxiVO selectVO(@Param("ew") Wrapper<YaofangxinxiEntity> wrapper);
   	
   	List<YaofangxinxiView> selectListView(Wrapper<YaofangxinxiEntity> wrapper);
   	
   	YaofangxinxiView selectView(@Param("ew") Wrapper<YaofangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaofangxinxiEntity> wrapper);
   	
}

