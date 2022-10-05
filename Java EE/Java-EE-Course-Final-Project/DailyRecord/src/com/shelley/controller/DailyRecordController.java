package com.shelley.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.shelley.entity.DailyRecord;
import com.shelley.service.DailyRecordService;
import com.shelley.service.impl.DailyRecordServiceImpl;

@Controller
public class DailyRecordController {
	private DailyRecordService service = new DailyRecordServiceImpl();
	
	@RequestMapping("/login.action")
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/login.jsp");
		return mav;
		
	}

	@RequestMapping("/list.action")
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
		List<DailyRecord> list = service.findAll();
		mav.addObject("record",list);
		mav.setViewName("/homepage.jsp");
		return mav;
		
	}
	
	@RequestMapping("/add.action")
	public ModelAndView save(DailyRecord record){
		ModelAndView mav = new ModelAndView();
		service.save(record);
		mav.setViewName("redirect:/list.action");
		
		return mav;
		
	}
	@RequestMapping("/delete.action")
	public ModelAndView delete(Integer id){
		ModelAndView mav = new ModelAndView();	
		service.delete(id);
		mav.setViewName("redirect:/list.action");
		
		return mav;
		
	}
	@RequestMapping("/ready.action")
	public ModelAndView ready(Integer id){
		
		ModelAndView mav = new ModelAndView();
		
		DailyRecord record = service.findById(id);
		mav.addObject("record",record);
		mav.setViewName("/update.jsp");//let data show update.jsp
		return mav;
	}
	@RequestMapping("/update.action")
	public ModelAndView update(DailyRecord record){
		
		ModelAndView mav = new ModelAndView();
		
		service.update(record);
		mav.setViewName("redirect:/list.action");//redirect to show
		return mav;
	}
}
