package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingchuangleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingchuangleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingchuangleibieView;


/**
 * 病床类别
 *
 * @author 
 * @email 
 * @date 2021-04-15 15:10:24
 */
public interface BingchuangleibieService extends IService<BingchuangleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingchuangleibieVO> selectListVO(Wrapper<BingchuangleibieEntity> wrapper);
   	
   	BingchuangleibieVO selectVO(@Param("ew") Wrapper<BingchuangleibieEntity> wrapper);
   	
   	List<BingchuangleibieView> selectListView(Wrapper<BingchuangleibieEntity> wrapper);
   	
   	BingchuangleibieView selectView(@Param("ew") Wrapper<BingchuangleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingchuangleibieEntity> wrapper);
   	
}

