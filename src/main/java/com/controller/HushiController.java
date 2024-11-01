package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HushiEntity;
import com.entity.view.HushiView;

import com.service.HushiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 护士
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-15 15:10:23
 */
@RestController
@RequestMapping("/hushi")
public class HushiController {
    @Autowired
    private HushiService hushiService;
    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		HushiEntity user = hushiService.selectOne(new EntityWrapper<HushiEntity>().eq("hushigonghao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(user.getId(), username,"hushi",  "护士" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody HushiEntity hushi){
    	//ValidatorUtils.validateEntity(hushi);
    	HushiEntity user = hushiService.selectOne(new EntityWrapper<HushiEntity>().eq("hushigonghao", hushi.getHushigonghao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		hushi.setId(uId);
        hushiService.insert(hushi);
        return R.ok();
    }
	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        HushiEntity user = hushiService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	HushiEntity user = hushiService.selectOne(new EntityWrapper<HushiEntity>().eq("hushigonghao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
        user.setMima("123456");
        hushiService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HushiEntity hushi,
		HttpServletRequest request){
        EntityWrapper<HushiEntity> ew = new EntityWrapper<HushiEntity>();
		PageUtils page = hushiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hushi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HushiEntity hushi, HttpServletRequest request){
        EntityWrapper<HushiEntity> ew = new EntityWrapper<HushiEntity>();
		PageUtils page = hushiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hushi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HushiEntity hushi){
       	EntityWrapper<HushiEntity> ew = new EntityWrapper<HushiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hushi, "hushi")); 
        return R.ok().put("data", hushiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HushiEntity hushi){
        EntityWrapper< HushiEntity> ew = new EntityWrapper< HushiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hushi, "hushi")); 
		HushiView hushiView =  hushiService.selectView(ew);
		return R.ok("查询护士成功").put("data", hushiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HushiEntity hushi = hushiService.selectById(id);
        return R.ok().put("data", hushi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HushiEntity hushi = hushiService.selectById(id);
        return R.ok().put("data", hushi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HushiEntity hushi, HttpServletRequest request){
    	hushi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hushi);
    	HushiEntity user = hushiService.selectOne(new EntityWrapper<HushiEntity>().eq("hushigonghao", hushi.getHushigonghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		hushi.setId(new Date().getTime());
        hushiService.insert(hushi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HushiEntity hushi, HttpServletRequest request){
    	hushi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hushi);
    	HushiEntity user = hushiService.selectOne(new EntityWrapper<HushiEntity>().eq("hushigonghao", hushi.getHushigonghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		hushi.setId(new Date().getTime());
        hushiService.insert(hushi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HushiEntity hushi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hushi);
        hushiService.updateById(hushi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hushiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HushiEntity> wrapper = new EntityWrapper<HushiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = hushiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
