package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaofangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaofangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaofangView;


/**
 * 药房
 *
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface YaofangService extends IService<YaofangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaofangVO> selectListVO(Wrapper<YaofangEntity> wrapper);
   	
   	YaofangVO selectVO(@Param("ew") Wrapper<YaofangEntity> wrapper);
   	
   	List<YaofangView> selectListView(Wrapper<YaofangEntity> wrapper);
   	
   	YaofangView selectView(@Param("ew") Wrapper<YaofangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaofangEntity> wrapper);
   	
}

