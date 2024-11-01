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


import com.dao.YaofangDao;
import com.entity.YaofangEntity;
import com.service.YaofangService;
import com.entity.vo.YaofangVO;
import com.entity.view.YaofangView;

@Service("yaofangService")
public class YaofangServiceImpl extends ServiceImpl<YaofangDao, YaofangEntity> implements YaofangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaofangEntity> page = this.selectPage(
                new Query<YaofangEntity>(params).getPage(),
                new EntityWrapper<YaofangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaofangEntity> wrapper) {
		  Page<YaofangView> page =new Query<YaofangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaofangVO> selectListVO(Wrapper<YaofangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaofangVO selectVO(Wrapper<YaofangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaofangView> selectListView(Wrapper<YaofangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaofangView selectView(Wrapper<YaofangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
