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


import com.dao.BingrenxinxiDao;
import com.entity.BingrenxinxiEntity;
import com.service.BingrenxinxiService;
import com.entity.vo.BingrenxinxiVO;
import com.entity.view.BingrenxinxiView;

@Service("bingrenxinxiService")
public class BingrenxinxiServiceImpl extends ServiceImpl<BingrenxinxiDao, BingrenxinxiEntity> implements BingrenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingrenxinxiEntity> page = this.selectPage(
                new Query<BingrenxinxiEntity>(params).getPage(),
                new EntityWrapper<BingrenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingrenxinxiEntity> wrapper) {
		  Page<BingrenxinxiView> page =new Query<BingrenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingrenxinxiVO> selectListVO(Wrapper<BingrenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingrenxinxiVO selectVO(Wrapper<BingrenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingrenxinxiView> selectListView(Wrapper<BingrenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingrenxinxiView selectView(Wrapper<BingrenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
