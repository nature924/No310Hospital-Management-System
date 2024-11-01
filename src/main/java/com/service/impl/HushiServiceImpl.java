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


import com.dao.HushiDao;
import com.entity.HushiEntity;
import com.service.HushiService;
import com.entity.vo.HushiVO;
import com.entity.view.HushiView;

@Service("hushiService")
public class HushiServiceImpl extends ServiceImpl<HushiDao, HushiEntity> implements HushiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HushiEntity> page = this.selectPage(
                new Query<HushiEntity>(params).getPage(),
                new EntityWrapper<HushiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HushiEntity> wrapper) {
		  Page<HushiView> page =new Query<HushiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HushiVO> selectListVO(Wrapper<HushiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HushiVO selectVO(Wrapper<HushiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HushiView> selectListView(Wrapper<HushiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HushiView selectView(Wrapper<HushiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
