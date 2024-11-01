package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopinleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopinleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinleibieView;


/**
 * 药品类别
 *
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface YaopinleibieService extends IService<YaopinleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopinleibieVO> selectListVO(Wrapper<YaopinleibieEntity> wrapper);
   	
   	YaopinleibieVO selectVO(@Param("ew") Wrapper<YaopinleibieEntity> wrapper);
   	
   	List<YaopinleibieView> selectListView(Wrapper<YaopinleibieEntity> wrapper);
   	
   	YaopinleibieView selectView(@Param("ew") Wrapper<YaopinleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopinleibieEntity> wrapper);
   	
}

