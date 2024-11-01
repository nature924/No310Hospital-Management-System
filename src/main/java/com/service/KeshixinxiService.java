package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeshixinxiView;


/**
 * 科室信息
 *
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface KeshixinxiService extends IService<KeshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeshixinxiVO> selectListVO(Wrapper<KeshixinxiEntity> wrapper);
   	
   	KeshixinxiVO selectVO(@Param("ew") Wrapper<KeshixinxiEntity> wrapper);
   	
   	List<KeshixinxiView> selectListView(Wrapper<KeshixinxiEntity> wrapper);
   	
   	KeshixinxiView selectView(@Param("ew") Wrapper<KeshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeshixinxiEntity> wrapper);
   	
}

