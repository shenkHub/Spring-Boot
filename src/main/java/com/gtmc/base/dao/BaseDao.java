package com.gtmc.base.dao;

import java.util.HashMap;
import java.util.List;

import com.gtmc.base.db.ServiceControl;

public class BaseDao {

    /** serviceControl */
    private ServiceControl serviceControl;

    /**
     * 构造函数
     * @param serviceControl serviceControl
     */
    public BaseDao(ServiceControl serviceControl) {

        this.serviceControl = serviceControl;
    }

    /**
     * 取得serviceControl对象
     * @return serviceControl对象
     */
    public ServiceControl getServiceControl() {

        return serviceControl;
    }

    /**
     * 检索
     * 
     * @param sql sql
     * @param params 參數
     * @return 結果
     * @throws Exception 異常
     */
    protected List<HashMap<Object, Object>> doSelect(String sql, Object... params) throws Exception {

        return getServiceControl().find(sql, params);
    }

    /**
     * 更新
     * 
     * @param sql sql
     * @param params 參數
     * @return 結果
     * @throws Exception 異常
     */
    protected int doUpdate(String sql, Object... params) throws Exception {

        return getServiceControl().update(sql, params);
    }

    /**
     * 根据SQL检索
     * 
     * @param sql sql
     * @param params 參數
     * @return 結果
     * @throws Exception 異常
     */
    protected List<HashMap<Object, Object>> doDirect(String sql, Object... params) throws Exception {

        return getServiceControl().findDirect(sql, params);
    }
    /**
     * 根据SQL检索
     * 
     * @param sql sql
     * @param params 參數
     * @return 結果
     * @throws Exception 異常
     */
    protected List<HashMap<Object, Object>> doDirectForArray(String sql,Object[] params) throws Exception {
        return getServiceControl().findDirect(sql, params);
    }
    
    /**
     * 更新
     * 
     * @param sql sql
     * @param params 參數
     * @return 結果
     * @throws Exception 異常
     */
    protected int doDirectForUpdate(String sql, Object[] params) throws Exception {

        return getServiceControl().updateDirect(sql, params);
    }
}
