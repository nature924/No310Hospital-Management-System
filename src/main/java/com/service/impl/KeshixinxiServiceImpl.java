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


import com.dao.KeshixinxiDao;
import com.entity.KeshixinxiEntity;
import com.service.KeshixinxiService;
import com.entity.vo.KeshixinxiVO;
import com.entity.view.KeshixinxiView;

@Service("keshixinxiService")
public class KeshixinxiServiceImpl extends ServiceImpl<KeshixinxiDao, KeshixinxiEntity> implements KeshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeshixinxiEntity> page = this.selectPage(
                new Query<KeshixinxiEntity>(params).getPage(),
                new EntityWrapper<KeshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeshixinxiEntity> wrapper) {
		  Page<KeshixinxiView> page =new Query<KeshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeshixinxiVO> selectListVO(Wrapper<KeshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeshixinxiVO selectVO(Wrapper<KeshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeshixinxiView> selectListView(Wrapper<KeshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeshixinxiView selectView(Wrapper<KeshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
