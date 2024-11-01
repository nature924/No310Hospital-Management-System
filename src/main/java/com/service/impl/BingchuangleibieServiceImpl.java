package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BingchuangleibieDao;
import com.entity.BingchuangleibieEntity;
import com.service.BingchuangleibieService;
import com.entity.vo.BingchuangleibieVO;
import com.entity.view.BingchuangleibieView;

@Service("bingchuangleibieService")
public class BingchuangleibieServiceImpl extends ServiceImpl<BingchuangleibieDao, BingchuangleibieEntity> implements BingchuangleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingchuangleibieEntity> page = this.selectPage(
                new Query<BingchuangleibieEntity>(params).getPage(),
                new EntityWrapper<BingchuangleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingchuangleibieEntity> wrapper) {
		  Page<BingchuangleibieView> page =new Query<BingchuangleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingchuangleibieVO> selectListVO(Wrapper<BingchuangleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingchuangleibieVO selectVO(Wrapper<BingchuangleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingchuangleibieView> selectListView(Wrapper<BingchuangleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingchuangleibieView selectView(Wrapper<BingchuangleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
