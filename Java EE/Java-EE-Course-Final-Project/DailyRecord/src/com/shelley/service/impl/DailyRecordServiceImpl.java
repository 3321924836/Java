package com.shelley.service.impl;
import java.util.List;

import com.shelley.dao.DailyRecordDao;
import com.shelley.dao.impl.DailyRecordDaoImpl;
import com.shelley.entity.DailyRecord;
import com.shelley.service.DailyRecordService;

public class DailyRecordServiceImpl implements DailyRecordService{

	//create Dao class
		private DailyRecordDao recordDao = new DailyRecordDaoImpl();
		
		public void save(DailyRecord record) {
			recordDao.save(record);
		}
		public void delete(Integer id) {
			recordDao.delete(id);
		}
		public void update(DailyRecord record) {
			recordDao.update(record);
		}
		public DailyRecord findById(Integer id) {
			return recordDao.findById(id);
		}
		public List<DailyRecord> findAll() {
			return recordDao.findAll();
		}
		
}
