package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingchuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingchuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingchuangView;


/**
 * 病床
 *
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface BingchuangService extends IService<BingchuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingchuangVO> selectListVO(Wrapper<BingchuangEntity> wrapper);
   	
   	BingchuangVO selectVO(@Param("ew") Wrapper<BingchuangEntity> wrapper);
   	
   	List<BingchuangView> selectListView(Wrapper<BingchuangEntity> wrapper);
   	
   	BingchuangView selectView(@Param("ew") Wrapper<BingchuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingchuangEntity> wrapper);
   	
}

