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


import com.dao.YaofangxinxiDao;
import com.entity.YaofangxinxiEntity;
import com.service.YaofangxinxiService;
import com.entity.vo.YaofangxinxiVO;
import com.entity.view.YaofangxinxiView;

@Service("yaofangxinxiService")
public class YaofangxinxiServiceImpl extends ServiceImpl<YaofangxinxiDao, YaofangxinxiEntity> implements YaofangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaofangxinxiEntity> page = this.selectPage(
                new Query<YaofangxinxiEntity>(params).getPage(),
                new EntityWrapper<YaofangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaofangxinxiEntity> wrapper) {
		  Page<YaofangxinxiView> page =new Query<YaofangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaofangxinxiVO> selectListVO(Wrapper<YaofangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaofangxinxiVO selectVO(Wrapper<YaofangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaofangxinxiView> selectListView(Wrapper<YaofangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaofangxinxiView selectView(Wrapper<YaofangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
