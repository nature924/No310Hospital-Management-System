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


import com.dao.YaopinleibieDao;
import com.entity.YaopinleibieEntity;
import com.service.YaopinleibieService;
import com.entity.vo.YaopinleibieVO;
import com.entity.view.YaopinleibieView;

@Service("yaopinleibieService")
public class YaopinleibieServiceImpl extends ServiceImpl<YaopinleibieDao, YaopinleibieEntity> implements YaopinleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopinleibieEntity> page = this.selectPage(
                new Query<YaopinleibieEntity>(params).getPage(),
                new EntityWrapper<YaopinleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopinleibieEntity> wrapper) {
		  Page<YaopinleibieView> page =new Query<YaopinleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopinleibieVO> selectListVO(Wrapper<YaopinleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopinleibieVO selectVO(Wrapper<YaopinleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopinleibieView> selectListView(Wrapper<YaopinleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopinleibieView selectView(Wrapper<YaopinleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
