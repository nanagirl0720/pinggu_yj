package com.ruoyi.common.utils;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.logging.LogLevel;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

/**
 * 执行数据加载文件工具类
 * 
 * @author panda
 */
public class DataUtils {

	public  void MzKdSr(String hsDate) {
		loadMzKdSr("'"+hsDate+"'");
	}
	
	public  void loadMzKdSr(String hsDate) {
		try {
			String filePath =  this.getClass().getResource("/static/datafile/mzkdsr.ktr").getFile();
			//InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("/static/datafile/mzkdsr.ktr");
			Long startTime = System.currentTimeMillis();
			KettleEnvironment.init();
	        TransMeta transMeta = new TransMeta(filePath);
	        Trans trans = new Trans(transMeta);
			trans.setLogLevel(LogLevel.ERROR);
			trans.setVariable("hsDate", hsDate);
			trans.prepareExecution(null);
			trans.startThreads();
			// 等待转换执行结束
			trans.waitUntilFinished();
			Long endTime = System.currentTimeMillis();
			System.out.println("获取门诊收入数据'"+hsDate+"'所用时间:"+(endTime - startTime)/1000);
			if (trans.getErrors() > 0) {
				throw new RuntimeException("There were errors during transfor mation execution.");
			}
		} catch (KettleException e) {
			System.out.println(e);
		}
	}
}
