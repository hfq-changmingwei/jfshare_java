package com.jfshare.brand.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfshare.brand.dao.mysql.IBrandDao;
import com.jfshare.brand.dao.mysql.ISubjectBrandDao;
import com.jfshare.brand.model.TbBrand;
import com.jfshare.brand.model.TbSubjectBrandKey;
import com.jfshare.finagle.thrift.brand.BrandInfo;
import com.jfshare.finagle.thrift.brand.QueryParam;
import com.jfshare.utils.BeanUtil;

/**
 * Created by lenovo on 2015/9/28.
 */
@Service
public class BrandSvcImpl implements com.jfshare.brand.service.IBrandSvc {
    @Autowired
    private IBrandDao brandDaoImpl;
    @Autowired
    private ISubjectBrandDao subjectBrandDaoImpl;
    @Override
    public int queryCount(QueryParam param) {
        return brandDaoImpl.queryCount(param);
    }

    @Override
    public List<BrandInfo> queryByPage(QueryParam param) {
        List<BrandInfo> brandInfos = new ArrayList<BrandInfo>();
        List<TbBrand> tbBrands = brandDaoImpl.queryByPage(param);
        for(TbBrand item : tbBrands) {
            BrandInfo brandInfo = new BrandInfo();
            Map<String, Object> stringObjectMap = BeanUtil.transBean2Map(item);
            BeanUtil.fillBeanData(brandInfo, stringObjectMap);
            brandInfos.add(brandInfo);
        }

        return brandInfos;
    }

    @Override
    public List<BrandInfo> query() {
        List<BrandInfo> brandInfos = new ArrayList<BrandInfo>();
        List<TbBrand> tbBrands = brandDaoImpl.query();
        for(TbBrand item : tbBrands) {
            BrandInfo brandInfo = new BrandInfo();
            Map<String, Object> stringObjectMap = BeanUtil.transBean2Map(item);
            BeanUtil.fillBeanData(brandInfo, stringObjectMap);
            brandInfos.add(brandInfo);
        }

        return brandInfos;
    }

    @Override
    public List<BrandInfo> queryByIds(List<Integer> validIdList) {
        List<BrandInfo> brandInfos = new ArrayList<BrandInfo>();
        List<TbBrand> tbBrands = brandDaoImpl.queryByIds(validIdList);
        for(TbBrand item : tbBrands) {
            BrandInfo brandInfo = new BrandInfo();
            Map<String, Object> stringObjectMap = BeanUtil.transBean2Map(item);
            BeanUtil.fillBeanData(brandInfo, stringObjectMap);
            brandInfos.add(brandInfo);
        }

        return brandInfos;
    }

	@Override
	public int addBrand(BrandInfo brand) {
		if(brand!=null){
			if(brand.name.isEmpty()||brand.name.length()<=0){
				return 1;
			}else if(brand.imgKey.isEmpty()||brand.imgKey.length()<=0){
				return 1;
			}else if(brand.createId<=0){
				return 1;
			}
			TbBrand tbBrand = new TbBrand();
			tbBrand.setName(brand.name);
			tbBrand.setImgKey(brand.imgKey);
			tbBrand.setUrl(brand.url);
			tbBrand.setSerial(0);
			tbBrand.setRemark(brand.remark);
			tbBrand.setCreateTime(new Date());
			tbBrand.setCreateId(brand.createId);
			tbBrand.setLastUpdateTime(new Date());
			tbBrand.setLastUpdateId(brand.lastUpdateId>0?brand.lastUpdateId:brand.createId);
			tbBrand.setState(0);
			
			brandDaoImpl.addBrand(tbBrand);
		}else{
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteBrand(int id) {
		return brandDaoImpl.deleteBrand(id);
	}

	@Override
	public int updateBrand(BrandInfo brand) {
		if(brand!=null){
			if(brand.name.isEmpty()||brand.name.length()<=0){
				return 1;
			}else if(brand.imgKey.isEmpty()||brand.imgKey.length()<=0){
				return 1;
			}else if(brand.lastUpdateId<=0){
				return 1;
			}
			TbBrand tbBrand = new TbBrand();
			tbBrand.setId(brand.id);
			tbBrand.setName(brand.name);
			tbBrand.setImgKey(brand.imgKey);
			tbBrand.setUrl(brand.url);
			tbBrand.setSerial(0);
			tbBrand.setRemark(brand.remark);
			tbBrand.setLastUpdateTime(new Date());
			tbBrand.setLastUpdateId(brand.lastUpdateId);
			
			brandDaoImpl.updateBrand(tbBrand);
		}else{
			return 1;
		}
		return 0;
	}

	@Override
	public List<BrandInfo> queryBySubject(int id) {
		List<TbSubjectBrandKey> listKeys = subjectBrandDaoImpl.queryBySubjectId(id);
		List<Integer> listintIntegers = new ArrayList<Integer>();
		for(TbSubjectBrandKey key: listKeys){
			listintIntegers.add(key.getBrandId());
		}
		List<BrandInfo> brandInfos = new ArrayList<BrandInfo>();
		List<TbBrand> tbBrands = brandDaoImpl.queryByIds(listintIntegers);
        for(TbBrand item : tbBrands) {
            BrandInfo brandInfo = new BrandInfo();
            Map<String, Object> stringObjectMap = BeanUtil.transBean2Map(item);
            BeanUtil.fillBeanData(brandInfo, stringObjectMap);
            brandInfos.add(brandInfo);
        }
	    return brandInfos;
	}
    
    
}
