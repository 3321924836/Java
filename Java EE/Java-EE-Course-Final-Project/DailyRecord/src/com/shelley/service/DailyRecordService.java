package com.shelley.service;

import java.util.List;

import com.shelley.entity.DailyRecord;

public interface DailyRecordService {
	// add
	void save(DailyRecord record);

	// delete
	void delete(Integer id);

	// update
	void update(DailyRecord record);

	// select By Id
	DailyRecord findById(Integer id);

	// select all
	List<DailyRecord> findAll();
}
