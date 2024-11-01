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


import com.dao.BingchuangDao;
import com.entity.BingchuangEntity;
import com.service.BingchuangService;
import com.entity.vo.BingchuangVO;
import com.entity.view.BingchuangView;

@Service("bingchuangService")
public class BingchuangServiceImpl extends ServiceImpl<BingchuangDao, BingchuangEntity> implements BingchuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingchuangEntity> page = this.selectPage(
                new Query<BingchuangEntity>(params).getPage(),
                new EntityWrapper<BingchuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingchuangEntity> wrapper) {
		  Page<BingchuangView> page =new Query<BingchuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingchuangVO> selectListVO(Wrapper<BingchuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingchuangVO selectVO(Wrapper<BingchuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingchuangView> selectListView(Wrapper<BingchuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingchuangView selectView(Wrapper<BingchuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
