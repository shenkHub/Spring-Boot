package com.gtmc.common.macrodef;

/**
 * SampleConst.java
 * 
 * @author common
 *
 */
public class GtmcConst {

    /** 共通 */
    public interface CommonValue {

        /** 空文字列 */
        public static final String NULL_SPACE = "";

        /** 半角空格 */
        public static final String HALF_SPACE = " ";

        /** 全角空格 */
        public static final String FULL_SPACE = "　";

        /** 逗号 */
        public static final String COMMA = ",";

        /** 没有时刻 */
        public static final String NOT_TIME = "00:00:00";

        /** 执行者 */
        public static final String USER = "ibpp";

        public static final int LOGIN_FAIL_COUNT_ICLUB = 5;

        /** 登录失败，账户锁定时间 */
        public static final int LOGIN_FAIL_LOCK_ICLUB = 3;

        /** 短信发送限制车架号类型 */
        public static final String VIN_NO = "LVG";

        /** 一个车架号最大绑定账号数 */
        public static final int VIN_BIND_USER_COUNT_MAX = 5;

        /** 销售优惠券check结果详细最大长度 UTF-8编码 4000字节 */
        public static final int SALES_COUPON_CHECK_DETAIL_MAX = 4000;

    }

    /** SQL ID */
    public interface SqlId {
        // modify 20160107 将获取的工单状态信息逐条存入工单状态信息表中 by zhang_huafang at start
        /** 向工单信息表中保存数据 */
        public static final String SQL_SaveOrderStatusInfo_001 = "sql.SaveOrderStatusInfo.001";
        /** 根据主键查询工单信息表中数据是否存在 */
        public static final String SQL_SaveOrderStatusInfo_002 = "sql.SaveOrderStatusInfo.002";
        /** 修改工单信息表的数据 */
        public static final String SQL_SaveOrderStatusInfo_003 = "sql.SaveOrderStatusInfo.003";
        /** 查询工单信息表中数据是否存在 */
        public static final String SQL_SaveOrderStatusInfo_004 = "sql.SaveOrderStatusInfo.004";
        // modify 20160107 将获取的工单状态信息逐条存入工单状态信息表中 by zhang_huafang at end
        // update 20151217 for 数据删除改为数据更新，根据updateTime更新 by zhang_huafang at
        // start
        /** 工单明细信息更新 */
        public static final String SQL_UpdateSrvdetail_001 = "sql.UpdateSrvdetail.001";
        /** 查询工单明细信息updateTime */
        public static final String SQL_SelSrvdetail_001 = "sql.SelSrvdetail.001";
        /** 工单信息更新 */
        public static final String SQL_UpdateOrderInfo_001 = "sql.UpdateOrderInfo.001";
        /** 查询工单信息updateTime */
        public static final String SQL_SelOrderInfo_001 = "sql.SelOrderInfo.001";
        /** 零件明细信息更新 */
        public static final String SQL_SelPartsdetail_001 = "sql.SelPartsdetail.001";
        /** 查询零件明细信息updateTime */
        public static final String SQL_UpdatePartsdetail_001 = "sql.UpdatePartsdetail.001";
        /** 零件明细临时表信息更新 */
        public static final String SQL_UpdatePartsdetailtemp_001 = "sql.UpdatePartsdetailtemp.001";
        /** 查询零件明细临时表信息updateTime */
        public static final String SQL_SelPartsdetailtemp_001 = "sql.SelPartsdetailtemp.001";
        // update 20151217 for 数据删除改为数据更新，根据updateTime更新 by zhang_huafang at end
        // update 20151215 for 新车注册时将工单信息、工单状态信息推送给APP by zhang_huafang at start
        /** 推送工单信息给APPSQL001 */
        public static final String SQL_OrderInfo_APP_002 = "sql.OrderInfoAPP.002";
        /** 推送工单状态给APPSQL001 */
        public static final String SQL_OrderStatus_APP_002 = "sql.OrderStatusAPP.002";
        // update 20151215 for 新车注册时将工单信息、工单状态信息推送给APP by zhang_huafang at end
        // update 20151205 for 判断优惠券是否为企业号 by zhang_huafang at start
        /** 获取活动id */
        public static final String SQL_GETEVNETNUMBER_001 = "sql.getEventNumber.001";
        /** 判断优惠券是否存在 */
        public static final String SQL_GETCOUNT_001 = "sql.getCount.001";
        /** 保存应用的数据 */
        public static final String SQL_SAVE_001 = "sql.save.001";
        /** 保存核销的数据 */
        public static final String SQL_SAVE_002 = "sql.save.002";
        /** 修改应用的数据 */
        public static final String SQL_UPDATE_001 = "sql.update.001";
        /** 修改核销的数据 */
        public static final String SQL_UPDATE_002 = "sql.update.002";

        public static final String SQL_VehicleRegist_001 = "sql.vehicleRegist.001";
        // update 20151205 for 判断优惠券是否为企业号 by zhang_huafang at end
        /** IF0034、35、36获取车型信息 SQL001 */
        public static final String SQL_COUPONCOMMON_001 = "sql.CouponCommon.001";

        /** IF0038销售店基础信息 SQL001 */
        public static final String SQL_DEALER_INFO_001 = "sql.DealerInfo.001";

        /** IF0039区域省市信息 SQL001 */
        public static final String SQL_REGION_INFO_001 = "sql.RegionInfo.001";

        /** IF0040协力会信息 SQL001 */
        public static final String SQL_COOPERATION_INFO_001 = "sql.CooperationInfo.001";

        /** IF0041车型主数据 SQL001 */
        public static final String SQL_MODEL_INFO_001 = "sql.ModelInfo.001";

        /** IF0024获取车主车辆信息 SQL001 */
        public static final String SQL_VHC_INFO_001 = "sql.VhcInfo.001";

        /** IF0024获取车主车辆信息 SQL002 */
        public static final String SQL_VHC_INFO_002 = "sql.VhcInfo.002";

        /** IF0024获取车主车辆信息 SQL003 */
        public static final String SQL_VHC_INFO_003 = "sql.VhcInfo.003";

        /** IF0024获取车主车辆信息 SQL004 */
        public static final String SQL_VHC_INFO_004 = "sql.VhcInfo.004";

        // Modify for:获取车主车辆信息 根据VIN号后6位和发动机后4位匹配车主车辆信息 xing_lili 20160315 start
        /** IF0024获取车主车辆信息 SQL005 */
        public static final String SQL_VHC_INFO_005 = "sql.VhcInfo.005";
        // Modify for:获取车主车辆信息 根据VIN号后6位和发动机后4位匹配车主车辆信息 xing_lili 20160315 end

        /** IF0024查询【账号认证信息】，获取统合管理 */
        public static final String SQL_VHC_INFO_006 = "sql.VhcInfo.006";

        /** IF0045 新车订单车辆物流信息 SQL001 */
        public static final String SQL_VHC_LOGI_INFO_001 = "sql.VhcLogiInfo.001";

        /** IF0045 新车订单车辆物流信息 SQL001 */
        public static final String SQL_VHC_LOGI_INFO_002 = "sql.VhcLogiInfo.002";

        /** IF0026 新车订单信息 SQL001 */
        public static final String SQL_NEW_CAR_INFO_001 = "sql.NewCarOrdeInfo.001";

        /** IF0026 新车订单信息 SQL001 */
        public static final String SQL_NEW_CAR_INFO_002 = "sql.NewCarOrdeInfo.002";

        /** IF0028 订单车辆信息 SQL001 */
        public static final String SQL_ORDE_CAR_INFO_001 = "sql.OrdeCarInfo.001";

        /** IF0022 客户领取活动订单发送 SQL001 */
        public static final String SQL_ACTIVITY_INFO_FORSEND = "sql.ActivityInfoForSend.001";

        /** IF0022 客户领取活动订单发送 SQL002 */
        public static final String SQL_ACTIVITY_INFO_FORSEND_002 = "sql.ActivityInfoForSend.002";

        /** IF0022 客户领取活动订单发送 SQL003 */
        public static final String SQL_ACTIVITY_INFO_FORSEND_003 = "sql.ActivityInfoForSend.003";

        /** IF0021 活动组和活动的关系 SQL001 */
        public static final String SQL_ACTIGROU_RELATION = "sql.ActiGrouRelation.001";

        /** IF0020 售后活动零件内容 SQL001 */
        public static final String SQL_ACTIVITY_CONTENT = "sql.ActivityContent.001";

        /** IF0019 售后活动组主数据 SQL001 */
        public static final String SQL_ACTIVITY_GROUP_INFO = "sql.ActivityGroupInfo.001";

        /** IF0018 售后活动组范围 SQL001 */
        public static final String SQL_ACTIVITY_GROUP_RANGE = "sql.ActivityGroupRange.001";

        /** IF0017 售后活动组图片 SQL001 */
        public static final String SQL_ACTIVITY_GROUP_PIC = "sql.ActivityGroupPic.001";

        /** IF0016 售后活动主数据 SQL001 */
        public static final String SQL_ACTIVITY_INFO_FORGET = "sql.ActivityInfoForGet.001";

        /** IF0042 APP车主信息 SQL001 */
        public static final String SQL_APP_USER_INFO_001 = "sql.AppUserInfoForSend.001";

        /** IF0042 APP车主信息 SQL002 */
        public static final String SQL_APP_USER_INFO_002 = "sql.AppUserInfoForSend.002";

        /** IF0042 APP车主信息 SQL003 */
        public static final String SQL_APP_USER_INFO_003 = "sql.AppUserInfoForSend.003";

        /** IF0043 APP车辆信息 SQL001 */
        public static final String SQL_APP_VEHICLE_INFO_001 = "sql.AppVehicleInfoForSend.001";

        /** IF0043 APP车辆信息 SQL002 */
        public static final String SQL_APP_VEHICLE_INFO_002 = "sql.AppVehicleInfoForSend.002";

        /** IF0043 APP车辆信息 SQL003 */
        public static final String SQL_APP_VEHICLE_INFO_003 = "sql.AppVehicleInfoForSend.003";

        /** IF_TACT_0001 客户领取活动信息获取 SQL001 */
        public static final String SQL_ACTIVITY_INFO_001 = "sql.ActivityInfo.001";

        /** IF_TACT_0001 客户领取活动信息获取 SQL002 */
        public static final String SQL_ACTIVITY_INFO_002 = "sql.ActivityInfo.002";

        /** IF_TACT_0001 客户领取活动信息获取 SQL003 */
        public static final String SQL_ACTIVITY_INFO_003 = "sql.ActivityInfo.003";

        /** IF0011 预约申请状态返回 SQL001 */
        public static final String SQL_APPLY_STATUS_001 = "sql.ApplyStatus.001";

        /** IF0010 获取预约申请信息 SQL001 */
        public static final String SQL_AAPLY_001 = "sql.ApplyForSend.001";

        /** IF0010 保存预约申请信息 SQL002 */
        public static final String SQL_AAPLY_002 = "sql.ApplyForSend.002";

        /** IF0010 更新预约申请信息 SQL003 */
        public static final String SQL_AAPLY_003 = "sql.ApplyForSend.003";

        /** IF0010 更新预约申请信息 SQL004 */
        public static final String SQL_AAPLY_004 = "sql.ApplyForSend.004";

        /** IF0012 获取预约申请信息 SQL001 */
        public static final String SQL_AAPLY_CANCEL_001 = "sql.ApplyCancel.001";

        /** IF0012 保存预约申请信息 SQL002 */
        public static final String SQL_AAPLY_CANCEL_002 = "sql.ApplyCancel.002";

        /** IF0012 删除预约申请信息 SQL003 */
        public static final String SQL_AAPLY_CANCEL_003 = "sql.ApplyCancel.003";

        /** IF0012 获取预约申请信息 SQL004 */
        public static final String SQL_AAPLY_CANCEL_004 = "sql.ApplyCancel.004";

        // ADD for:获取员工信息 zhang_lei 20170313 start
        /** IF0055 获取员工信息 SQL001 */
        public static final String SQL_EMPLOYEE_001 = "sql.EmployeeForSend.001";
        /** IF0055 员工信息插入 SQL002 */
        public static final String SQL_EMPLOYEE_002 = "sql.EmployeeForSend.002";
        /** IF0055 员工信息更新 SQL003 */
        public static final String SQL_EMPLOYEE_003 = "sql.EmployeeForSend.003";
        // ADD for:获取员工信息 zhang_lei 20170313 end

        /** IF0023 活动码状态变更 SQL001 */
        public static final String SQL_ACTIVITY_STATUS_001 = "sql.ActivityStatus.001";

        /** IF0023 活动码状态变更 SQL002 */
        public static final String SQL_ACTIVITY_STATUS_002 = "sql.ActivityStatus.002";

        /** IF0023 活动码状态变更 SQL003 */
        public static final String SQL_ACTIVITY_STATUS_003 = "sql.ActivityStatus.003";

        /** IF0047 维修保养工单状态获取 SQL001 */
        public static final String SQL_CURR_MAIN_ORDER_STATUS_NOVIN = "sql.CurrMainOrderStatus_NoVin";

        /** IF0047 维修保养工单状态获取 SQL002 */
        public static final String SQL_CURR_MAIN_ORDER_STATUS = "sql.CurrMainOrderStatus";

        /** 微信IF0038 优惠券信息 SQL001 */
        public static final String SQL_WCOUPINFO_ACTUAL_SQL001 = "sql.WCoupInfoActual.001";

        /** 微信IF0038 删除优惠券信息 SQL002 */
        public static final String SQL_WCOUPINFO_ACTUAL_SQL002 = "sql.WCoupInfoActual.002";

        /** 微信优惠卷使用条件 SQL001 */
        public static final String SQL_CoupRule_001 = "sql.CoupRule.001";

        /** 微信优惠卷使用条件SQL002 */
        public static final String SQL_CoupRule_002 = "sql.CoupRule.002";

        /** 微信优惠卷使用条件SQL003 */
        public static final String SQL_CoupRule_003 = "sql.CoupRule.003";

        /** 半价机油折扣金额SQL001 */
        public static final String SQL_CoupPrice_001 = "sql.CoupPrice.001";

        /** 工单信息SQL001 */
        public static final String SQL_OrderInfo_001 = "sql.OrderInfo.001";

        /** 工单信息SQL002 */
        public static final String SQL_OrderInfo_002 = "sql.OrderInfo.002";

        /** 工单明细信息SQL001 */
        public static final String SQL_Srvdetail_001 = "sql.Srvdetail.001";

        /** 工单明细信息SQL002 */
        public static final String SQL_Srvdetail_002 = "sql.Srvdetail.002";

        /** 零件明细信息SQL001 */
        public static final String SQL_Partsdetail_001 = "sql.Partsdetail.001";

        /** 零件明细信息SQL002 */
        public static final String SQL_Partsdetail_002 = "sql.Partsdetail.002";

        /** 零件明细临时表信息SQL001 */
        public static final String SQL_Partsdetailtemp_001 = "sql.Partsdetailtemp.001";

        /** 零件明细临时表信息SQL002 */
        public static final String SQL_Partsdetailtemp_002 = "sql.Partsdetailtemp.002";

        /** App注册车辆SQL001 */
        public static final String SQL_AppVehicle_001 = "sql.AppVehicle.001";

        /** 推送工单信息给APPSQL001 */
        public static final String SQL_OrderInfo_APP_001 = "sql.OrderInfoAPP.001";

        /** 推送工单状态给APPSQL001 */
        public static final String SQL_OrderStatus_APP_001 = "sql.OrderStatusAPP.001";

        /** 推送工单状态给APPSQL001 */
        public static final String SQL_OrderStatus_APP_003 = "sql.OrderStatusAPP.003";

        /** 推送工单维修项目信息给APPSQL001 */
        public static final String SQL_OrderProject_APP_001 = "sql.OrderProjectAPP.001";

        /** 推送工单维零件信息给APPSQL001 */
        public static final String SQL_OrderParts_APP_001 = "sql.OrderPartsAPP.001";
        /** 推送工单维零件信息给APPSQL001 */
        public static final String SQL_OrderParts_APP_002 = "sql.OrderPartsAPP.002";

        // Add by huang_yeguang at 20170323 for App 端看到维修车辆项目与tact不符 start
        /** 施工项目明细DB现有数据查詢 */
        public static final String SQL_FIND_EXIST_ORDERPROJECTS_001 = "sql.FindExistOrderProjects.001";
        /** 零件明细DB现有数据查詢 */
        public static final String SQL_FIND_EXIST_ORDERPARTS_001 = "sql.FindExistOrderParts.001";
        /** 临时零件明细DB现有数据查詢 */
        public static final String SQL_FIND_EXIST_ORDERPARTS_002 = "sql.FindExistOrderParts.002";
        /** 施工项目明细DB失效数据删除 */
        public static final String SQL_UPDATE_EXIST_ORDERPROJECTS_001 = "sql.UpdateExistOrderProjects.001";
        /** 零件明细DB失效数据删除 */
        public static final String SQL_UPDATE_EXIST_ORDERPARTS_001 = "sql.UpdateExistOrderParts.001";
        /** 临时零件明细DB失效数据删除 */
        public static final String SQL_UPDATE_EXIST_ORDERPARTS_002 = "sql.UpdateExistOrderParts.002";
        // Add by huang_yeguang at 20170323 for App 端看到维修车辆项目与tact不符 end

        /** 员工专场折扣金额SQL001 */
        public static final String SQL_CoupPriceByVin_001 = "sql.CoupPriceByVin.001";

        /** 保养套餐推荐及预约信息(实时) SQL001 */
        public static final String SQL_FindIcopServiceIn_001 = "sql.FindIcopServiceIn.001";
        /** 保养套餐推荐及预约信息(实时) SQL002 */
        public static final String SQL_SaveIcopServiceIn_002 = "sql.SaveIcopServiceIn.002";
        /** 保养套餐推荐及预约信息(实时) SQL003 */
        public static final String SQL_UpdateIcopServiceIn_003 = "sql.UpdateIcopServiceIn.003";

        // Modify for:Check优惠券信息 xing_lili 20151225 start
        /** 微信 获取优惠券信息 */
        public static final String SQL_FindBindResult_001 = "sql.FindBindResult.001";
        /** 企业 获取优惠券信息 */
        public static final String sql_FindVeriResult_001 = "sql.FindVeriResult.001";
        // Modify for:Check优惠券信息 xing_lili 20151225 end

        // Modify for:保养套餐推荐及预约信息(实时)(预约信息保存及更新) xing_lili 20160106 start
        public static final String SQL_FindApplyInfo_001 = "sql.FindApplyInfo.001";
        public static final String SQL_InsertApplyInfo_002 = "sql.InsertApplyInfo.002";
        public static final String SQL_UpdateApplyInfo_003 = "sql.UpdateApplyInfo.003";
        public static final String SQL_SelAppointmentInfo_001 = "sql.selAppointmentInfo.001";
        // Modify for:保养套餐推荐及预约信息(实时)(预约信息保存及更新) xing_lili 20160106 end

        // Modify for:tack实时推送数据给APP信息修改 xing_lili 20160113 start
        // 查询零件表零件数量
        public static final String SQL_SELPARTSDETAILINFO_001 = "sql.selPartsdetailInfo.001";
        // 查询零件整合表
        public static final String SQL_SELPARTSWORKFLOWINFO_001 = "sql.selPartsWorkFlowInfo.001";
        // 插入零件整合表
        public static final String SQL_INSERTPARTSWORKFLOWINFO_001 = "sql.insertPartsWorkFlowInfo.001";
        // 更新零件整合表
        public static final String SQL_UPDATEPARTSWORKFLOWINFO_001 = "sql.updatePartsWorkFlowInfo.001";
        // 查询零件表
        public static final String SQL_ORDERPARTSDETAIL_001 = "sql.OrderPartsDetail.001";
        // 查询零件临时表
        public static final String SQL_ORDERPARTSTEMP_001 = "sql.OrderPartsTemp.001";
        // 查询零件整合表
        public static final String SQL_SELPARTSWORDFLOWINFO_001 = "sql.selPartsWordFlowInfo.001";
        // Modify for:tack实时推送数据给APP信息修改 xing_lili 20160113 end

        // Add for:问卷调查 xing_lili 20160524 start

        // 插入二维码信息表
        public static final String SQL_INSERTQRCODEINFO_001 = "sql.insertQrCodeInfo.001";
        // 查询二维码信息表
        public static final String SQL_SELQRCODEINFO_001 = "sql.selQrCodeInfo.001";
        public static final String SQL_SELQRCODEINFO_002 = "sql.selQrCodeInfo.002";
        public static final String SQL_SELQRCODEINFO_003 = "sql.selQrCodeInfo.003";
        // 更新二维码信息表
        public static final String SQL_UPDATEQRCODEINFO_001 = "sql.updateQrCodeInfo.001";
        // 查询红包信息表
        public static final String SQL_SELREDPACKETINFO_001 = "sql.selRedPacketInfo.001";
        public static final String SQL_SELREDPACKETINFO_002 = "sql.selRedPacketInfo.002";
        // 插入红包信息表
        public static final String SQL_INSERTREDPACKETINFO_001 = "sql.insertRedPacketInfo.001";
        // 更新红包信息表
        public static final String SQL_UPDATEREDPACKETINFO_001 = "sql.updateRedPacketInfo.001";
        // 更新红包表商户订单号
        public static final String SQL_UPDATEREDPACKETINFO_002 = "sql.updateRedPacketInfo.002";
        // 更新二维码答题Flg
        public static final String SQL_UPDATEQRCODEINFO_002 = "sql.updateQrCodeInfo.002";
        // 更新二维码项目
        public static final String SQL_UPDATEQRCODEINFO_003 = "sql.updateQrCodeInfo.003";

        // Add for:问卷调查 xing_lili 20160524 end

        // Add for:5月份增改 xing_lili 20160621 start
        public static final String SQL_SELDRIVINGAPPINFO_001 = "sql.selDrivingAppInfo.001";
        public static final String SQL_INSERTDRIVINGAPPINFO_001 = "sql.insertDrivingAppInfo.001";
        public static final String SQL_UPDATEDRIVINGAPPINFO_001 = "sql.updateDrivingAppInfo.001";
        public static final String SQL_UPDATEDRIVINGAPPINFO_002 = "sql.updateDrivingAppInfo.002";
        // Add for:5月份增改 xing_lili 20160621 end

        // Modify for:欧洲杯竞猜项目夏季活动 xing_lili 20160706 start
        public static final String SQL_COUPRULE_004 = "sql.CoupRule.004";
        // Modify for:欧洲杯竞猜项目夏季活动 xing_lili 20160706 end

        // modify 20160429 获取新车订单表信息 by zhang_huafang at start
        /** 获取新车订单表信息 */
        public static final String SQL_SELTACTORDERVEHICLEINFO_001 = "sql.SelTactOrderVehicleInfo.001";
        // modify 20160429 获取新车订单表信息 by zhang_huafang at end

        // Add for:I_Club会员积分管理 xing_lili 20160309 start
        /** 查询会员 */
        public static final String SQL_SELECTUSERCOREINFO_001 = "sql.selectUserCoreInfo.001";
        /** 新建会员 */
        public static final String SQL_NEWUSERCOREINFO_002 = "sql.newUserCoreInfo.002";
        /** 更新会员 */
        public static final String SQL_UPDATEUSERCOREINFO_003 = "sql.updateUserCoreInfo.003";
        /** 更新会员(更新积分) */
        public static final String SQL_UPDATEUSERCOREINFO_004 = "sql.updateUserCoreInfo.004";
        /** 查询会员 */
        public static final String SQL_SELECTUSERPOINTCALINFO_001 = "sql.selectUserPointCalInfo.001";
        /** 新建会员积分失效计算 */
        public static final String SQL_NEWUSERPOINTCALINFO_002 = "sql.newUserPointCalInfo.002";
        /** 更新会员积分失效计算 */
        public static final String SQL_UPDATEUSERPOINTCALINFO_003 = "sql.updateUserPointCalInfo.003";
        /** 更新会员积分失效计算 (等级升级) */
        public static final String SQL_UPDATEUSERPOINTCALINFO_004 = "sql.updateUserPointCalInfo.004";
        // 根据会员号查询会员信息同时加锁
        public static final String SQL_SELUSERCOREINFO_001 = "sql.selUserCoreInfo.001";
        // 获取会员等级变更履历是否存在
        public static final String SQL_SELUSERRANKCHGHISINFO_001 = "sql.selUserRankChgHisInfo.001";
        // 插入会员等级变更履历
        public static final String SQL_NEWUSERRANKCHGHISINFO_002 = "sql.newUserRankChgHisInfo.002";
        // 更新会员等级变更履历
        // public static final String SQL_UPDATEUSERRANKCHGHISINFO_003 =
        // "sql.updateUserRankChgHisInfo.003";
        // 获取会员核心信息变更履历是否存在
        public static final String SQL_SELUSERCORECHGHISINFO_001 = "sql.selUserCoreChgHisInfo.001";
        // 插入会员核心信息变更履历
        public static final String SQL_NEWUSERCORECHGHISINFO_002 = "sql.newUserCoreChgHisInfo.002";
        // 更新会员核心信息变更履历
        // public static final String SQL_UPDATEUSERCORECHGHISINFO_003 =
        // "sql.updateUserCoreChgHisInfo.003";
        // 根据会员号查询会员信息
        public static final String SQL_SELUSERCOREINFO_002 = "sql.selUserCoreInfo.002";
        // 根据会员号查询会员等级变更履历信息
        public static final String SQL_SELUSERRANKCHGHISINFO_002 = "sql.selUserRankChgHisInfo.002";
        // 获取当天生日的用户
        public static final String SQL_FAILUREPOINTUSER_001 = "sql.failurePointUser.001";
        // 获取用户的积分
        public static final String SQL_FAILUREPOINTUSER_002 = "sql.failurePointUser.002";

        // Add for:会员信息同步_账号车辆信息同步 peng_nijuan 20161229 start
        // 根据综合管理ID和VIN号查询账号车辆信息
        public static final String SQL_GETUSERCARINFO_001 = "sql.getUserCarInfo.001";
        // Add for:会员信息同步_账号车辆信息同步 peng_nijuan 20161229 end

        // Add for:会员信息同步_账号认证信息同步: peng_nijuan 20161230 start
        // 根据所属系统CD和客户ID查找账号认证信息
        public static final String SQL_GETUSERLOGININFO_001 = "sql.getUserLoginInfo.001";
        // Add for:会员信息同步_账号认证信息同步 peng_nijuan 20161230 end

        // Add for:会员信息同步_账号基本属性信息信息同步: peng_nijuan 20170102 start
        // 根据统合管理ID查找账号基本属性信息
        public static final String SQL_GETLOGINUSERBASEINFO_001 = "sql.getLogInUserBaseInfo.001";
        // Add for:会员信息同步_账号基本属性信息信息同步: peng_nijuan 20170102 end

        // Add By pengnj 20170117 start
        // 根据 参数.手机号码查询账号认证信息，取得所属系统CD，用户ID
        public static final String GET_USERRELATIONBYTEL_001 = "sql.getuserrelationbytel.001";
        // Add By pengnj 20170117 end

        // Add for:车主车辆信息保存/修改 xing_lili 20161008 start
        // 根据客户编号和所属系统CD查找统合管理ID
        public static final String SQL_GETUSERRELATION_001 = "sql.getUserRelation.001";
        // 根据综合管理ID和VIN号查询车辆信息是否存在
        public static final String SQL_GETVEHICLE_INFO_001 = "sql.getVehicleInfo.001";
        // add for 查询该车是否已被绑定过 by shen_kang 20170720 start
        /** 查询该车是否已被绑定过 */
        public static final String SQL_GETISALREADBIND_001 = "sql.getIsAlreadBind.001";
        // add for 查询该车是否已被绑定过 by shen_kang 20170720 end
        // 根据综合管理ID和VIN号查询车辆信息推给ICROP
        public static final String SQL_GETVEHICLE_INFO_002 = "sql.getVehicleInfo.002";
        // 查询已绑定的车辆是否存在
        public static final String SQL_GETVEHICLE_INFO_003 = "sql.getVehicleInfo.003";
        // Add for 车架号绑定账号限制 ZhangYu 20161219 start
        // 查询已绑定的车辆是否存在
        public static final String SQL_GETVEHICLE_INFO_004 = "sql.getVehicleInfo.004";
        // 查询用户已绑定的车辆
        public static final String SQL_GETVEHICLE_INFO_005 = "sql.getVehicleInfo.005";
        // Add for 车架号绑定账号限制 ZhangYu 20161219 end
        // Add for 首次绑车查询 zhanglei 20170412 start
        public static final String SQL_GETVEHICLE_INFO_006 = "sql.getVehicleInfo.006";
        // Add for 首次绑车查询 zhanglei 20170412 end
        // 保存车辆信息
        public static final String SQL_SAVEVEHICLEINFO_001 = "sql.saveVehicleInfo.001";
        // 更新车辆信息（解绑）
        public static final String SQL_UPDATEVEHICLEINFO_002 = "sql.updateVehicleInfo.002";
        // 保存车辆信息
        public static final String SQL_SAVEVEHICLEINFO_002 = "sql.saveVehicleInfo.002";
        // 根据手机号及系统所属CD获取账号信息
        public static final String SQL_GETUSERINFO_001 = "sql.getUserInfo.001";
        // 根据手机号码获取账号信息
        public static final String SQL_GETUSERINFO_003 = "sql.getUserInfo.003";
        // 根据所属系统CD和用户ID获取账号信息
        public static final String SQL_GETUSERINFO_002 = "sql.getUserInfo.002";
        // 根据手机号及系统所属CD获取账号信息
        public static final String SQL_GETUSERINFO_004 = "sql.getUserInfo.004";
        // 根据用户ID获取账号信息
        public static final String SQL_GETUSERINFO_005 = "sql.getUserInfo.005";
        // 获得序列
        public static final String SQL_GETSEQVALINFO_001 = "sql.getSeqValInfo.001";
        // 保存账号认证信息
        public static final String SQL_SAVEUSERINFO_001 = "sql.saveUserInfo.001";
        // 查询APP车主信息是否存在
        public static final String SQL_GETUSERBASEINFO_001 = "sql.getUserBaseInfo.001";
        // 查询APP车主信息
        public static final String SQL_GETUSERBASEINFO_002 = "sql.getUserBaseInfo.002";
        // 保存APP车主信息
        public static final String SQL_SAVEUSERBASEINFO_001 = "sql.saveUserBaseInfo.001";
        // Add for:车主车辆信息保存/修改 xing_lili 20161008 end

        // Add for:电商系统用户信息同步给I-Club by lu_chuanchuan at 20171201 start
        // 根据系统cd和uidGtmc查询用户信息
        public static final String SQL_GETUSERLOGININFO_002 = "sql.getUserLoginInfo.002";
        // 根据统合管理ID查找账号基本属性信息
        public static final String SQL_GETLOGINUSERBASEINFO_002 = "sql.getLogInUserBaseInfo.002";

        // Add for:电商系统用户信息同步给I-Club by lu_chuanchuan at 20171201 end

        // Add for APP车主信息同步至EIP jiao_jianying 20161228 start
        // 更新账号认证信息的激活Flag
        public static final String SQL_UPDATE_ACTIVE_FLAG_001 = "sql.updateActiveFlag.001";
        // 更新账号认证信息的密码
        public static final String SQL_UPDATE_PASSWORD_001 = "sql.updatePassword.001";
        // Add for APP车主信息同步至EIP jiao_jianying 20161228 end
        // Add for 用户注册
        // 无统合管理ID时插入账号认证信息数据
        public static final String SQL_EBUserRegister_001 = "sql.EBUserRegister.001";
        // 有统合管理ID时插入账号认证信息数据
        public static final String SQL_EBUserRegister_003 = "sql.EBUserRegister.003";
        // 插入账号基本属性数据
        public static final String SQL_EBUserRegister_002 = "sql.EBUserRegister.002";
        // Add for:获取会员核心履历信息（2016-11-20上线） xing_lili 20161102 start
        // 获取会员核心信息
        public static final String SQL_USERCOREINFO_001 = "sql.UserCoreInfo.001";
        // 获取会员积分失效计算信息
        public static final String SQL_USERPOINTCALINFO_001 = "sql.UserPointCalInfo.001";
        // 获取会员核心信息变更履历信息
        public static final String SQL_USERCORECHGHISINFO_001 = "sql.UserCoreChgHisInfo.001";
        // 获取会员等级变更履历信息
        public static final String SQL_USERRANKCHGHISINFO_001 = "sql.UserRankChgHisInfo.001";
        // Add for:获取会员核心履历信息（2016-11-20上线） xing_lili 20161102 end

        // Add for chen_yuan 20170418 start
        // 根据系统所属CD获取统合管理ID
        public static final String SQL_GETUSERINFO_006 = "sql.getUserInfo.006";
        // Add for chen_yuan 20170418 end

        // Add for App会员积分获取接口 20170102 jiao_jianying start
        // 根据所属系统CD和手机号码查询APP用户的账号信息
        public static final String SQL_SELAPPUSERINFO_001 = "sql.selAppUserInfo.001";
        // 会员积分信息推送
        public static final String SQL_SELAPPUSERPOINTINFO_001 = "sql.selAppUserPointInfo.001";
        // Add for App会员积分获取接口 20170102 jiao_jianying end

        // Add for 用户登录
        public static final String SQL_EBUserLogin_001 = "sql.EBUserLogin.001";
        public static final String SQL_EBUserLogin_002 = "sql.EBUserLogin.002";
        public static final String SQL_EBUserLogin_003 = "sql.EBUserLogin.003";
        public static final String SQL_EBUserLogin_004 = "sql.EBUserLogin.004";
        public static final String SQL_EBUSERFORUPDATE_001 = "sql.EBUserForUpdate.001";
        public static final String SQL_EBUSERFORUPDATE_002 = "sql.EBUserForUpdate.002";
        public static final String SQL_UpdateActivateFlg_001 = "sql.UpdateActivateFlg.001";

        // Add for 电商活动优惠券一览详细信息取得
        public static final String SQL_EBEventCouponInfo_001 = "sql.EBEventCouponInfo.001";
        // Add for 电商会员信息查看
        public static final String SQL_EBUserInfo_001 = "sql.EBUserInfo.001";
        // Add for 电商TACT优惠券
        public static final String SQL_LeftEBCoupon_001 = "sql.LeftEBCoupon.001";
        public static final String SQL_LeftEBCoupon_002 = "sql.LeftEBCoupon.002";
        public static final String SQL_LeftEBCoupon_003 = "sql.LeftEBCoupon.003";
        public static final String SQL_LeftEBCoupon_004 = "sql.LeftEBCoupon.004";
        public static final String SQL_LeftEBCoupon_005 = "sql.LeftEBCoupon.005";
        public static final String SQL_LeftEBCoupon_006 = "sql.LeftEBCoupon.006";
        public static final String SQL_LeftEBCoupon_007 = "sql.LeftEBCoupon.007";
        public static final String SQL_LeftEBCoupon_008 = "sql.LeftEBCoupon.008";

        // Add for 电商会员积分履历查询
        public static final String SQL_EBUserPointHisInfo_001 = "sql.EBUserPointHisInfo.001";

        // 根据统合管理ID查询用户ID
        public static final String SQL_SELUID_BY_GTMC_001 = "sql.selUIDByGTMC.001";

        // Add for 电商会员信息更新
        // 账号车辆信息查询
        public static final String SQL_SelectCarInfo_001 = "sql.SelectCarInfo.001";

        // 根据所属系统CD和统合管理ID查询用户信息
        public static final String SQL_SelectEBUserInfo_001 = "sql.SelectEBUserInfo.001";

        // add for 电商增加用户信息到帐号基本属性表 by lu_chuanchuan at 20171201 start
        // 查找信息
        public static final String SQL_SelectUserBaseInfo_001 = "sql.selectUserBaseInfo.001";
        // 添加信息
        public static final String SQL_insertUserBaseInfo_001 = "sql.insertUserBaseInfo.001";
        // add for 电商增加用户信息到帐号基本属性表 by lu_chuanchuan at 20171201 end

        // 账号认证信息更新
        public static final String SQL_UpdateEBUserInfo_001 = "sql.UpdateEBUserInfo.001";
        // 账号基本属性信息更新
        public static final String SQL_UpdateEBUserInfo_002 = "sql.UpdateEBUserInfo.002";
        // 账号车辆信息更新
        public static final String SQL_UpdateEBUserInfo_003 = "sql.UpdateEBUserInfo.003";
        // 账号车辆信息插入
        public static final String SQL_InsertEBUserCarInfo_001 = "sql.InsertEBUserCarInfo.001";
        // Add for 更新EB用户积分

        public static final String SQL_newEBUserCoreChgHisInfo_002 = "sql.newEBUserCoreChgHisInfo.002";

        // Add For 电商活动优惠券领取接口

        // Add by YQ Start
        // 电商平台领取指定活动ID的第三方优惠券(微信优惠券活动)
        public static final String SQL_SELECT_EBEVENT_COUPON_INFO_001 = "sql.SelectEBEventCouponInfo.001";
        // 电商平台领取指定活动ID的TACT优惠券(微信优惠券活动)
        public static final String SQL_SELECT_EBEVENT_COUPON_INFO_002 = "sql.SelectEBEventCouponInfo.002";
        // 当电商平台不指定活动ID的场合，查询指定用户所属TACT优惠券状态(微信优惠券活动)
        public static final String SQL_SELECT_EBEVENT_COUPON_INFO_003 = "sql.SelectEBEventCouponInfo.003";
        // 领取成功后，将该张被领取优惠券的OPEN_ID更新锁表用(微信优惠券活动)
        public static final String SQL_SELECT_EBEVENT_COUPON_INFO_FOR_UP_004 = "sql.SelectEBEventCouponInfoForUp.004";
        // 第三方优惠券被电商平台一次性全部领取完毕后，被领取第三方优惠券的卡券状态(优惠券状态)更新(微信优惠券活动)
        public static final String SQL_UPDATE_EBEVENT_COUPON_INFO_001 = "sql.UpdateEBEventCouponInfo.001";
        // 领取成功后，将该张被领取优惠券的OPEN_ID更新(微信优惠券活动)
        public static final String SQL_UPDATE_EBEVENT_COUPON_INFO_002 = "sql.UpdateEBEventCouponInfo.002";
        // 电商平台领取指定活动ID的TACT优惠券(销售优惠券活动)
        public static final String SQL_SELECT_EBEVENT_COUPON_INFO_006 = "sql.SelectEBEventCouponInfo.006";
        // 当电商平台不指定活动ID的场合，查询指定用户所属TACT优惠券状态(销售优惠券活动)
        public static final String SQL_SELECT_EBEVENT_COUPON_INFO_007 = "sql.SelectEBEventCouponInfo.007";
        // 领取成功后，将该张被领取优惠券的OPEN_ID更新锁表用(销售优惠券活动)
        public static final String SQL_SELECT_EBEVENT_COUPON_INFO_FOR_UP_008 = "sql.SelectEBEventCouponInfoForUp.008";
        // 领取成功后，将该张被领取优惠券的OPEN_ID更新(销售优惠券活动)
        public static final String SQL_UPDATE_EBEVENT_COUPON_INFO_004 = "sql.UpdateEBEventCouponInfo.004";
        // Add by YQ End

        public static final String SQL_SELECT_SALES_COUPON_INFO_001 = "sql.SelectSalesCouponInfo.001";
        // Add For 电商活动优惠券领取接口

        // add for 活动id（String -- > List<String> ） by liangxiao at 20170522
        // start
        public static final String SQL_SELECT_SALES_COUPON_INFO_005 = "sql.SelectSalesCouponInfo.005";
        // add for 活动id（String -- > List<String> ） by liangxiao at 20170522 end

        // add for 订单问卷推送履历 by liangxiao at 20170523 start
        public static final String SQL_SELECT_PAPER_SEND_HIS_LIST_001 = "sql.SelectPaperSendHisList.001";
        // add for 订单问卷推送履历 by liangxiao at 20170523 end

        // Add 20170517 for 电商优惠券一览取得 by liangxiao at Start
        public static final String SQL_SELECT_DEALER_FROM_NAME_001 = "sql.SelectDealerFromName.001";
        // Add 20170517 for 电商优惠券一览取得 by liangxiao at End

        // Add 20170526 for EIP用户判断 by liangxiao at Start
        public static final String SQL_SELECT_USER_LOGIN_001 = "sql.SelectUserLogin.001";
        // Add 20170526 for EIP用户判断 by liangxiao at End

        // Add 20170606 for 售后满意度调查 by liangxiao at Start
        // 问卷信息获取
        public static final String SELECT_QUESTIONNAIRE_INFO_001 = "sql.SelectQuestionnaireInfo.001";

        // 维修工单信息获取
        public static final String SELECT_SRV_ORDER_INFO_001 = "sql.SelectSrvOrderInfo.001";

        // 问卷同步中间表数据DB追加
        public static final String SQL_INSERT_APP_QUESTIONNAIRE_MIDDLE_001 = "sql.InsertAppQuestionnaireMiddle.001";

        public static final String SQL_SELECT_APP_QUESTIONNAIRE_HISTORY_001 = "sql.SelectAppQuestionnaireHistory.001";
        // Add 20170606 for 售后满意度调查 by liangxiao at End

        // Add For 销售优惠券绑定
        public static final String SQL_UPDATE_SALES_COUPON_BIND_001 = "sql.UpdateSalesCoupBind.001";
        public static final String SQL_UPDATE_SALES_COUPON_BIND_002 = "sql.UpdateSalesCoupBind.002";
        public static final String SQL_SELECT_SALES_COUPON_BIND_001 = "sql.SelectSalesCoupBind.001";
        // Add for 电商销售优惠券同步给APP by liangxiao at 20170815 start
        public static final String SQL_SELECT_SALES_COUPON_BIND_002 = "sql.SelectSalesCoupBind.002";
        // Add for 电商销售优惠券同步给APP by liangxiao at 20170815 end
        /** 获取销售优惠券信息 */
        public static final String SQL_TACTSALESCOUPONCONTENT_001 = "sql.tactSalesCouponContent.001";

        /** 获取销售优惠券规则 */
        public static final String SQL_TACTSALESCOUPONCONTENT_002 = "sql.tactSalesCouponContent.002";

        /** 销售优惠券验证履历新规 */
        public static final String SQL_INSERTSALESCOUPONCHECKHISTORY_001 = "sql.insertSalesCouponCheckHistory.001";

        /** 销售优惠券核销 */
        public static final String SQL_UPDATE_TACT_SALE_COUPON_CONTENT_001 = "sql.UpdateTactSaleCouponContent.001";

        // Add for 入库期间丰云行App邀约短信推送 jiao_jianying 20161207 start
        /** 发送对象信息取得 */
        public static final String SQL_SELECT_SEND_MESSAGE_HISTORY_001 = "sql.selectSendMessageHistory.001";

        /** 发信成功后对象信息更新 */
        public static final String SQL_UPDATE_SEND_MESSAGE_HISTORY_001 = "sql.updateSendMessageHistory.001";

        /** 发信失败后对象信息更新 */
        public static final String SQL_UPDATE_SEND_MESSAGE_HISTORY_002 = "sql.updateSendMessageHistory.002";

        /** 手机号发送信息履历件数查询 */
        public static final String SQL_SEL_MESSAGE_HISTORY_001 = "sql.selMessageHistory.001";

        /** 发送信息履历新规 */
        public static final String SQL_INSERT_MESSAGE_HISTORY_001 = "sql.insertMessageHistory.001";

        /** 查询当日是否发送短信 */
        public static final String SQL_SEL_MESSAGE_HISTORY_002 = "sql.selMessageHistory.002";

        /** 维修工单信息TEL是否存在检查 */
        public static final String SQL_SEL_USER_REGIST_INFO_001 = "sql.selUserRegistInfo.001";

        // Add for 入库期间丰云行App邀约短信推送 jiao_jianying 20161207 end

        /** 账户车辆信息 */
        public static final String SQL_SELECTEBUSERCARINFO_001 = "sql.selectEBUserCarInfo.001";

        /** 新车订单表信息 */
        public static final String SQL_SELECTTEMPTACTORDERVEHICLE_001 = "sql.selectTempTactOrderVehicle.001";

        /** 活动组信息 */
        public static final String SQL_SELECTCVMACTIVITYGROUP_001 = "sql.selectCvmActivityGroup.001";

        // add for 优惠券取得 yuan_yumei 20161215 Start
        /** 优惠券信息表 */
        public static final String SQL_SELECTWXCOUPONCONTEN_001 = "sql.selectWxCouponContent.001";

        /** 优惠券信息表绑定 */
        public static final String SQL_UPDATEWXCOUPONCONTEN_001 = "sql.UpdateWxCouponContent.001";

        // add for APP优惠券信息表绑定 by liang_xiao at 20170704 start
        /** APP优惠券信息表绑定 */
        public static final String SQL_UPDATEWXCOUPONCONTENBIND_002 = "sql.UpdateWxCouponContentBind.002";
        // add for APP优惠券信息表绑定 by liang_xiao at 20170704 end

        // add for 优惠券取得 yuan_yumei 20161215 End
        // add for 优惠券核销 xie_dandan 20161216 Start
        /** 优惠券信息表核销 */
        public static final String SQL_SELECTWXCOUPONCONTEN_002 = "sql.selectWxCouponContent.002";
        /** 优惠券信息表核销 */
        public static final String SQL_UPDATEWXCOUPONCONTEN_002 = "sql.UpdateWxCouponContent.002";
        // add for 优惠券核销 xie_dandan 20161216 end
        // add for app优惠券核销 by liangxiao 20170704 start
        public static final String SQL_UPDATEAPPCOUPONCONTEN_002 = "sql.UpdateAppCouponContent.002";
        // add for app优惠券核销 by liangxiao 20170704 end
        // add for 新汉兰达活动优惠券核销 by liangxiao 20170831 start
        // 获取车型代码
        public static final String SQL_SELECT_VHC_CODE_001 = "sql.selectVhcCode.001";
        // 获取维修零件
        public static final String SQL_SELECT_PARTS_CODE_001 = "sql.selectPartsCode.001";
        // 获取维修项目明细
        public static final String SQL_SELECT_SRV_DETAIL_001 = "sql.selectSrvDetail.001";
        // add for 新汉兰达活动优惠券核销 by liangxiao 20170831 end

        /** 新车订单信息检索 */
        public static final String SQL_GETTACTORDERVEHICLE_001 = "sql.getTactOrderVehicle.001";
        /** 新车订单信息登录 */
        public static final String SQL_INSERTTACTORDERVEHICLE_001 = "sql.insertTactOrderVehicle.001";
        /** 新车订单信息更新 */
        public static final String SQL_UPDATETACTORDERVEHICLE_001 = "sql.updateTactOrderVehicle.001";

        /** 获取车型名称 */
        public static final String SQL_GETVHCNAME_001 = "sql.getVhcName.001";

        /** 根据统合管理ID获取会员ID */
        public static final String SQL_SELECTUID_001 = "sql.selectUID.001";
        /** 销售优惠券使用数量【活动内叠加】 */
        public static final String SQL_SELECTSALESCOUPONUSEDCNT_001 = "sql.selectSalesCouponUsedCnt.001";
        /** 销售优惠券使用数量【活动外叠加】 */
        public static final String SQL_SELECTSALESCOUPONUSEDCNT_002 = "sql.selectSalesCouponUsedCnt.002";

        // Add for 智能交车新车订单以及新车生产物流状态 YQ 20161222 Start
        /** 新车订单信息查询 */
        public static final String SQL_SELECT_NEW_CAR_ORDER_INFO_001 = "sql.selectNewCarOrderInfo.001";

        /** 新车生产物流状态查询 */
        public static final String SQL_SELECT_NEW_CAR_STATUS_INFO_001 = "sql.selectNewCarStatusInfo.001";
        // Add for 智能交车新车订单以及新车生产物流状态 YQ 20161222 End

        // add for iclub2app站内信同步 xie_dandan 20161228 Start
        /** EIP站内信ID取得 */
        public static final String SQL_SELECTINNERMSG_001 = "sql.selectInnerMsg.001";
        /** EIP站内信信息取得 */
        public static final String SQL_SELECTINNERMSG_002 = "sql.selectInnerMsg.002";
        /** EIP站内信信息保存 */
        public static final String SQL_INSERTINNERMSG_001 = "sql.InsertInnerMsg.001";
        /** EIP向APP站内信同步成功 */
        public static final String SQL_UPDATEINNERMSG_002 = "sql.updateInnerMsg.001";
        // add for iclub2app站内信同步xie_dandan 20161228 end

        // add for:iclub2app优惠劵同步接口 yuan_yumei
        /** EIP向APP站内信同步成功 */
        public static final String SQL_TI_COUPON_EIP2APP_001 = "sql.insertTiCouponEip2app.001";

        // 20170303 月单位会员积分汇总 Add by YQ Start
        // 月单位会员积分汇总取得
        public static final String SQL_USER_POINT_SUM_INFO_001 = "sql.UserPointSumInfoList.001";
        // 20170303 月单位会员积分汇总 Add by YQ End

        // 20170317 电商APP优惠券信息取得 Add by zhanglei Start
        /** IF0056获取微信优惠券信息 SQL001 */
        public static final String SQL_WXCOUPONCONTENT_001 = "sql.WxCouponInfo.001";

        /** IF0056获取销售优惠券信息 SQL001 */
        public static final String SQL_TACTCOUPONCONTENT_001 = "sql.TactCouponInfo.001";
        // 20170317 电商APP优惠券信息取得 Add by zhanglei End

        // 20170829 优惠卷批量取得 by leikaiwei start
        /** 获取微信优惠券批量信息 SQL002 */
        public static final String SQL_WXCOUPONCONTENT_002 = "sql.WxCouponInfo.002";

        /** 获取微信优惠券批量信息 SQL003 */
        public static final String SQL_WXCOUPONCONTENT_003 = "sql.WxCouponInfo.003";
        // 20170829 优惠卷批量取得 by leikaiwei end

        // 20170412 优惠券失效 Add by liangxiao Start
        // 销售优惠券失效 Start
        /** 获取未使用的销售优惠券信息 SQL002 */
        public static final String SQL_SELECT_SALES_COUPON_INFO_002 = "sql.SelectSaleCouponInfo.002";

        /** 获取更新后销售优惠券信息 SQL003 */
        public static final String SQL_SELECT_SALES_COUPON_INFO_003 = "sql.SelectSaleCouponInfo.003";

        /** 更新优惠券状态为5：已失效 SQL001 */
        public static final String SQL_UPDATE_SALES_COUPON_INFO_001 = "sql.UpdateSaleCouponInfo.001";
        // 销售优惠券失效 End

        // 售后优惠券失效 Start
        /** 获取未使用的微信优惠券信息 SQL001 */
        public static final String SQL_SELECT_WX_COUPON_INFO_001 = "sql.SelectWXCouponInfo.001";

        /** 获取更新后微信优惠券信息 SQL002 */
        public static final String SQL_SELECT_WX_COUPON_INFO_002 = "sql.SelectWXCouponInfo.002";

        /** 更新优惠券状态为5：已失效 SQL001 */
        public static final String SQL_UPDATE_WX_COUPON_INFO_001 = "sql.UpdateWXCouponInfo.001";
        // 售后优惠券失效 End
        // 20170412 优惠券失效 Add by liangxiao End

        // Add 20170517 for电商优惠券同步给APP by liangxiao at Start
        /** 获取微信优惠券信息 SQL003 */
        public static final String SQL_SELECT_WX_COUPON_INFO_003 = "sql.SelectWXCouponInfo.003";
        // Add 20170517 for电商优惠券同步给APP by liangxiao at End

        // 20170421 优惠券生成 Add by liangxiao Start
        // 售后优惠券生成 Start
        // 获取活动id
        public static final String SQL_SELECT_EVENT_ID_001 = "sql.SelectEventId.001";

        // 获取优惠券ID列表
        public static final String SQL_SELECT_COUPON_ID_001 = "sql.SelectCouponId.001";
        // 售后优惠券生成 End
        // 20170421 优惠券生成 Add by liangxiao End

        // 20170419 电商APP优惠券信息取得 Add by zhanglei Start
        /** IF1018 app优惠券同步eip SQL001 */
        public static final String SQL_COUPONCONTENTAPP2EIP_001 = "sql.CouponApp2Eip.001";

        /** IF1018 app优惠券同步eip SQL002 */
        public static final String SQL_COUPONCONTENTAPP2EIP_002 = "sql.CouponApp2Eip.002";

        /** IF1018 app优惠券同步eip SQL003 */
        public static final String SQL_COUPONCONTENTAPP2EIP_003 = "sql.CouponApp2Eip.003";

        /** IF1018 app优惠券同步eip SQL004 */
        public static final String SQL_COUPONCONTENTAPP2EIP_004 = "sql.CouponApp2Eip.004";

        /** IF1018 app优惠券同步eip SQL005 */
        public static final String SQL_COUPONCONTENTAPP2EIP_005 = "sql.insertTiCouponapp2Eip.001";
        // 20170419 电商APP优惠券信息取得 Add by zhanglei end

        // 20170421 优惠券核销KPI Add by liangxiao Start
        // 优惠券KPI接口 Start
        /** 获取销售优惠券核销KPI信息 SQL001 */
        /** 获取销售优惠券核销KPI信息 SQL001 */
        public static final String SQL_SELECT_SALES_COUPON_KPI_001 = "sql.SelectSalesCouponKPI.001";

        public static final String SQL_SELECT_SALES_COUPON_KPI_002 = "sql.SelectSalesCouponKPI.002";

        // 20170421 优惠券核销KPI Add by liangxiao End

        // 20170421 优惠券规则取得 Add by liangxiao Start
        // 销售优惠券规则取得 Start
        /** 获取销售优惠券规则信息 SQL001 */
        public static final String SQL_SELECT_SALES_COUPON_RULE_001 = "sql.SelectSalesCouponRule.001";
        // 销售优惠券规则取得 End

        // 售后优惠券规则取得 Start
        /** 获取售后优惠券规则信息 SQL001 */
        public static final String SQL_SELECT_WX_COUPON_RULE_001 = "sql.SelectWXCouponRule.001";
        // 售后优惠券规则取得 End
        // 20170421 优惠券规则取得 Add by liangxiao End

        // ********20170412动态验证码生成及获取 Add by wanghao start******************
        /** 【动态验证码生成及获取】 查询该手机N分钟内是否有注册 */
        public static final String SQL_GET_DYNAMIC_CODE_001 = "sql.getdynamiccode.001";
        /** 【动态验证码生成及获取】 插入动态验证码获取履历 */
        public static final String SQL_INSERT_DYNAMIC_CODE_001 = "sql.insertdynamiccode.001";
        /** 【动态验证码生成及获取】 插入动态验证码登录 */
        public static final String SQL_INSERT_DYNAMIC_CODE_002 = "sql.insertdynamiccode.002";
        /** 【动态验证码生成及获取】 更新动态验证码登录 */
        public static final String SQL_UPDATE_DYNAMIC_CODE_002 = "sql.updatedynamiccode.002";
        /** 【动态验证码生成及获取】 查询该手机号在动态验证码登录中是否存在 */
        public static final String SQL_SELECT_DYNAMIC_CODE_001 = "sql.selectdynamiccode.001";
        /** 【动态验证码登录】查询该手机号、系统CD记录 */
        public static final String SQL_SELECT_LOGIN_CODE_001 = "sql.selectlogincode.001";
        /** 【动态验证码登录】插入登录日志 */
        public static final String SQL_INSERT_LOGIN_CODE_001 = "sql.insertlogincode.001";
        /** 【短信发送】插入短信发送履历 */
        public static final String SQL_INSERT_SEND_SMS_LOGS_001 = "sql.insertsendsmslogs.001";
        /** 【动态验证码生成及获取】查询当前月累计次数是否超过100次/当天累计次数是否超过10次/10分钟内累计次数是否超过3次 */
        public static final String CHECK_DYNAMIC_CODE_COUNT_001 = "sql.checkdynamiccodecount.001";
        /** 查询该手机号和系统所属CD的登录日志记录 */
        public static final String SQL_GET_CODE_LOGIN_001 = "sql.getCodeLogin.001";

        /** 【动态验证码登录】 查询当前手机号是否注册 */
        public static final String SQL_SELECT_IS_REGISTER_001 = "sql_select_is_register_001";
        // ********20170412动态验证码生成及获取 Add by wanghao end******************

        // ********20170419优惠券生成 Add by wanghao start****************
        /** 【优惠券生成】销售优惠券销售活动save */
        public static final String INSERT_SALES_EVENT_001 = "sql.insertsalesevent.001";
        /** 【优惠券生成】生成活动ID */
        public static final String SELECT_SALES_EVENT_001 = "sql.selectsalesevent.001";
        /** 【优惠券生成】查询现存的优惠券码 */
        public static final String SELECT_COUPON_CODE_LIST_001 = "sql.select_coupon_code_list_001";
        /** 【优惠券生成】传入vhcnamecode查询BASE_VEHICLE_MODEL表中的 SFXCODE */
        public static final String GET_SFX_CODE_001 = "sql.get_sfx_code_001";

        // ********20170419优惠券生成 Add by wanghao end******************

        // ********20170522问卷列表信息接口 Add by wanghao
        // start****************SQL_UPDATE_PAPER_LIST_001
        /** 问卷列表信息接口 */
        public static final String SQL_INSERT_PAPER_LIST_001 = "sql_insert_paper_list_001";
        /** 问卷列表信息接口 */
        public static final String SQL_UPDATE_PAPER_LIST_001 = "sql_update_paper_list_001";
        /** 问卷列表信息接口 */
        public static final String SQL_SELECT_PAPER_LIST_001 = "sql_select_paper_list_001";
        /** 问卷列表信息接口 */
        public static final String SQL_GET_REGISTER_USER_LIST_001 = "sql_get_register_user_list_001";

        /** 插入售后问卷触发表 */
        // ********20170522问卷列表信息接口 Add by wanghao start****************

        // Add for:透明车间车型视频接口 chen_yuan 20170413 start
        // 查询APP透明车间车型视频
        public static final String SQL_GETCARVIDEOURLBASEINFO_001 = "sql.getCarvideoUrlBaseInfo.001";
        // Add for:透明车间车型视频接口 chen_yuan 20170413 end

        // 20170413 维修保养工单临时信息接口 Add by shen_kang start
        /** 删除维修保养工单验证表过期数据 */
        public static final String SQL_DELSRVORDERVALIINFO_001 = "sql.delSrvOrderValiInfo.001";

        /** 删除维修明细验证表过期数据 */
        public static final String SQL_DELSRVDETAILVALIINFO_001 = "sql.delSrvDetailValiInfo.001";

        /** 删除零件明细验证表过期数据 */
        public static final String SQL_DELSRVPARTSDETAILVALIINFO_001 = "sql.delSrvPartsDetailValiInfo.001";

        /** 删除临时零件明细验证表过期数据 */
        public static final String SQL_DELSRVPARTSDETAILTEMPVALIINFO_001 = "sql.delSrvPartsDetailValiTempInfo.001";

        /** 根据主键删除维修保养工单验证表数据 */
        public static final String SQL_DELSRVORDERVALIINFO_002 = "sql.delSrvOrderValiInfo.002";

        /** 保存维修保养工单验证表 */
        public static final String SQL_INSERTSRVORDERVALIINFO_001 = "sql.insertSrvOrderValiInfo.001";

        /** 根据主键删除维修工单明细验证表 */
        public static final String SQL_DELSRVDETAILVALIINFO_002 = "sql.deltSrvDetailValiInfo.002";

        /** 保存维修工单明细验证表 */
        public static final String SQL_INSERTSRVDETAILVALIINFO_001 = "sql.insertSrvDetailValiInfo.001";

        /** 根据主键删除零件明细验证表 */
        public static final String SQL_DELSRVPARTSDETAILVALIINFO_002 = "sql.delSrvPartsDetailValiInfo.002";

        /** 保存零件明细验证表 */
        public static final String SQL_INSERTSRVPARTSDETAILVALIINFO_001 = "sql.insertSrvPartsDetailValiInfo.001";

        /** 根据主键删除临时零件明细验证表 */
        public static final String SQL_DELSRVPARTSDETAILTEMPVALIINFO_002 = "sql.delSrvPartsDetailValiTempInfo.002";

        /** 保存临时零件明细验证表 */
        public static final String SQL_INSERTSRVPARTSDETAILTEMPVALIINFO_001 = "sql.insertSrvPartsDetailValiTempInfo.001";
        // 20170413 维修保养工单临时信息接口 Add by shen_kang end

        // Add for:DBLink切换到接口方式 chen_yuan 20170414 start
        /** 账号基本属性认证信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_001 = "sql.getUserEbBaseInfo.001";
        /** 账号车辆信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_002 = "sql.getUserEbBaseInfo.002";
        /** 账号车辆信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_003 = "sql.getUserEbBaseInfo.003";
        /** 新车订单车辆信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_004 = "sql.getUserEbBaseInfo.004";
        /** 顾客车辆信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_005 = "sql.getUserEbBaseInfo.005";
        /** 车架引擎信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_006 = "sql.getUserEbBaseInfo.006";
        /** 工单信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_007 = "sql.getUserEbBaseInfo.007";
        /** 账号车辆信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_008 = "sql.getUserEbBaseInfo.008";
        /** 账号车辆信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_009 = "sql.getUserEbBaseInfo.009";
        /** 账号车辆信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_010 = "sql.getUserEbBaseInfo.010";
        /** 账号基本属性信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_011 = "sql.getUserEbBaseInfo.011";
        /** 顾客车辆信息获取 */
        public static final String SQL_GETUSEREBBASEINFO_012 = "sql.getUserEbBaseInfo.012";
        /** 账号车辆基本属性获取 */
        public static final String SQL_GETUSEREBBASEINFO_013 = "sql.getUserEbBaseInfo.013";
        // Add for:DBLink切换到接口方式 chen_yuan 20170414 end

        // Add by liangxiao 用户存在判断 at 20170801 start
        public static final String SQL_GET_USER_LOGIN_INFO_BY_TEL_001 = "sql.getUserLoginInfoByTel.001";
        // Add by liangxiao 用户存在判断 at 20170801 end

        // 20170416 优惠券验证接口 Add by shen_kang start
        /** 获取优惠券绑定工单号 */
        public static final String SQL_SELECTORDERCDBYCOUPONID_001 = "sql.selectOrderCdByCouponId_001";

        /** 获取工单信息 */
        public static final String SQL_SELECTORDERBYORDERNO_001 = "sql.selectOrderByOrderNo_001";

        /** 获取零件明细信息 */
        public static final String SQL_SELECTPARTSDETAIL_001 = "sql.SelectPartsDetail_001";

        /** 获取优惠券绑定的工单号 */
        public static final String SQL_SELECTCOUPONBINDORDERNO_001 = "sql_SelectCouponBindOrderNo_001";

        /** 获取优惠券绑定的工单号 */
        public static final String SQL_FINDBINDRESULT_002 = "sql.FindBindResult.002";

        /** 根据工单号获取工单绑定的优惠券信息 */
        public static final String SQL_SELECTEVENTIDBYORDERNO_001 = "sql.SelectEventIdByOrderNo_001";

        // 20170416 优惠券验证接口 Add by shen_kang end

        // 20170523 养车无忧优惠券领券领取 Add by zhanglei Start
        /** 获取养车无忧优惠券信息 */
        public static final String SQL_CVMCOUPON_001 = "sql.cvmcoupon.001";

        /** 更新养车无忧优惠券状态 */
        public static final String SQL_CVMCOUPON_002 = "sql.cvmcoupon.002";

        /** 更新养车无忧优惠券状态 */
        public static final String SQL_CVMCOUPON_003 = "sql.cvmcoupon.003";

        /** 更新养车无忧优惠券状态 */
        public static final String SQL_CVMCOUPON_004 = "sql.cvmcoupon.004";
        // add for 养车无忧优惠券内容 by shen_kang 20170615
        /** 养车无忧优惠券信息查询 */
        public static final String SQL_SELECTCVMCOUPON_001 = "sql.selectCvmCoupon.001";
        // 20170523 养车无忧优惠券领券领取 Add by zhanglei End

        // 20170602 订单注册用户列表接口 add by liangxiao start
        public static final String SQL_SELECT_TEMP_REGISTER_USER_LIST_001 = "sql.selectTempRegisterUserList.001";
        // 20170602 订单注册用户列表接口 add by liangxiao end

        // add for 返回统合管理ID by liangxiao at 20170613 start
        public static final String SQL_SELECTUSERLOGININFO_001 = "sql.selectUserLoginInfo.001";
        // add for 返回统合管理ID by liangxiao at 20170613 end

        // Add by chenyuan 20170603 start
        /** 会员ID查询 */
        public static final String SQL_GETEIPUSERID_001 = "sql.GetEipUserId.001";
        // Add by chenyuan 20170603 end

        // 20170609 保养无忧夏季服务活动优惠券生成 Add by shen_kang start
        /** 查询优惠券领取信息 */
        public static final String SQL_SELECTCVMCOUPONRECEIVE_001 = "sql.selectCvmCouponReceive.001";
        /** 根据套餐代码在CVM套餐表中查询相应的套餐信息 */
        public static final String SQL_SELECTCVMCOMBO_001 = "sql.selectCvmCombo.001";
        /** 根据项目代码查询基础套餐信息 */
        public static final String SQL_SELECTCVMCOMBOSTYLE_001 = "sql.selectCvmComboStyle.001";
        /** 查询优惠券码是否重复 */
        public static final String SQL_SELECTWXCOUPONCONTENT_003 = "sql.selectWxCouponContent.003";

        /** 查询秘钥是否重复 */
        public static final String SQL_SELECTCVMCOUPONRECEIVE_002 = "sql.selectCvmCouponReceive.002";

        /** 查询交车日 */
        public static final String SQL_SELECTFIRSTDELT_001 = "sql.selectFirstDelt.001";
        /** 生成优惠券 */
        public static final String SQL_INSERTWXCOUPONBYCVM_001 = "sql.insertWxCouponByCvm.001";
        /** 将优惠券领取信息插入到优惠券领取用户信息表中 */
        public static final String SQL_INSERTCVMCOUPONRECEIVE_001 = "sql.insertCvmCouponReceive.001";
        /** 更新优惠券领取信息 */
        public static final String SQL_UPDATECVMCOUPONRECEIVE_001 = "sql.updateCvmcouponReceive.001";
        /** 查询经销店基本信息 */
        public static final String SQL_SELECTBASEDEALERINFO_001 = "sql.selectBasedealerInfo.001";
        /** 优惠券绑定 */
        public static final String SQL_UPDATECVMWXCOUPONCONTENT_001 = "sql.UpdateCvmWxCouponContent.001";

        // 20170609 保养无忧夏季服务活动优惠券生成 Add by shen_kang end
        // 20170616 保养无忧夏季服务优惠券取得接口 add by shen_kang start
        /** 查询优惠券领取用户信息表 */
        public static final String SQL_SELECTCVMCOUPONRE_001 = "sql.selectCvmCouponRe.001";
        /** 根据优惠券码查询优惠券信息 */
        public static final String SQL_SELECTWXCOUPONFORCVM_001 = "sql.selectWxCouponForCvm.001";
        // 20170616 保养无忧夏季服务优惠券取得接口 add by shen_kang end

        // 20170627 售后夏季服务活动优惠券发放 add by shen_kang start
        /** 根据零件代码查询零件类型 */
        public static final String SQL_SELECTPARTTYPE_001 = "sql.selectPartType.001";
        /** 根究手机号码查询统合管理ID */
        public static final String SQL_SELECTUIDGTMCBYTEL_001 = "sql.selectUidGtmcByTel.001";
        /** 查询本次活动的优惠券ID */
        public static final String SQL_SELECTGUSTCOUPON_001 = "sql.selectGustCoupon.001";
        /** 将优惠券与用户进行绑定 */
        public static final String SQL_UPDATEGUSTCOUPON_001 = "sql.updateGustCoupon.001";
        /** 将用户领券信息插入到夏季服务活动优惠券领取表中 */
        public static final String SQL_INSERTSUMMERCOUPONRECEIVE_001 = "sql.insertSummerCouponReceive.001";
        /** 更新优惠券领取表 */
        public static final String SQL_UPDATESUMMERCOUPONRECEIVE_001 = "sql.updateSummerCouponReceive.001";
        /** 查询工单是否已在领取表中存在 */
        public static final String SQL_SELECTSUMMERCOUPONRE_001 = "sql.selectSummerCouponRe.001";
        /** 查询优惠券信息 */
        public static final String SQL_SELECTWXCOUPON_001 = "sql.selectWxCoupon.001";
        /** 更新微信优惠券信息（核销） */
        public static final String SQL_UPDATECVMANDCUSTWXCOUPONCONTENT_001 = "sql.UpdateCvmAndCustWxCouponContent.001";
        // 20170627 售后夏季服务活动优惠券发放 add by shen_kang end
        // Add by zhanglei at 20170706 for App 端看到维修车辆项目与tact不符 start
        /** 发信成功后对象信息更新 */
        public static final String SQL_UPDATE_SRV_SRVDETAIL_F_001 = "sql.updatesrvsrvdetailf.001";
        // Add by zhanglei at 20170706 for App 端看到维修车辆项目与tact不符 end

        // Add for 优惠券批次信息处理 by lu_chuanchaun at 20170814 start
        /** 查询优惠券批次信息表 */
        public static final String SQL_SELECTCOUPONBATCHCONTENT_001 = "sql.selectCouponBatchContent.001";
        /** 删除优惠券批次信息表 */
        public static final String SQL_DELETECOUPONBATCHCONTENT_001 = "sql.deleteCouponBatchContent.001";
        /** 插入优惠券批次信息 */
        public static final String SQL_INSERTCOUPONBATCHCONTENT_001 = "sql.insertCouponBatchContent.001";
        // Add for 优惠券批次信息处理 by lu_chuanchaun at 20170814 end

        // Add for APP销售优惠券 by shen_kang 20170811 start
        /** 查询app销售优惠券基本信息 */
        public static final String SQL_GETWXCOUPONCONTENT_001 = "sql.getWxCouponContent.001";
        /** 查询app销售优惠券使用规则 */
        public static final String SQL_GETAPPSALESCOUPONRULE_001 = "sql.getAppSalesCouponRule.001";
        /** 查询预购协议号已绑定/核销多少张优惠券 */
        public static final String SQL_GETORDERNOUSECNT_001 = "sql.getOrderNoUseCnt.001";
        /** 查询预购协议号绑定核销优惠券总金额 */
        public static final String SQL_GETORDERNOMONEYSUM_001 = "sql.getOrderNoMoneySum.001";
        /** 查询APP优惠券使用限制条件 */
        public static final String SQL_GETAPPSALEUSELIMIT_001 = "sql.getAppSaleUseLimit.001";
        /** 查询车型信息 */
        public static final String SQL_GETVEHICLEMODELBYSFX_001 = "sql.getVehicleModelBySfx.001";
        /** app优惠券绑定/解绑 */
        public static final String SQL_APPSALESCOUPBIND_001 = "sql.appSalesCoupBind.001";
        /** app优惠券核销 */
        public static final String SQL_APPSALESCOUPVERI_001 = "sql.appSalesCoupVeri.001";
        /** 查询工单已绑定的优惠券码 */
        public static final String SQL_SELECTBINDCNTFORAPPSALES_001 = "sql.selectBindCntForAppSales.001";
        // Add for APP销售优惠券 by shen_kang 20170811 end

        // Add by lu_chuanchuan at 20170721 for根据电话删除用户信息 start
        public static final String SQL_SELECT_USERLOGIN_001 = "sql.selectUserLogin.001";
        public static final String SQL_DELETE_USERLOGIN_001 = "sql.deleteUserLoginByuidGtmc.001";
        public static final String SQL_DELETE_USERBASEINFO_001 = "sql.deleteUserBaseInfoByuidGtmc.001";
        public static final String SQL_DELETE_USERCAR_001 = "sql.deleteUserCarByuidGtmc.001";
        // Add by lu_chuanchuan at 20170721 for根据电话删除用户信息 end
        // ADD for 车辆解绑次数限制 by shen_kang 20170825 start
        /** 查询车辆解绑次数 */
        public static final String SQL_GETUNBINDCOUNTBYVINNO_001 = "sql.getUnBindCountByVinNo.001";
        /** 插入车辆解绑信息 */
        public static final String SQL_INSERTUNBINDCOUNT_001 = "sql.insertUnbindCount.001";
        /** 更新车辆解绑次数 */
        public static final String SQL_UPDATEUNBINDCOUNT_001 = "sql.updateUnbindCount.001";
        // ADD for 车辆解绑次数限制 by shen_kang 20170825 end
        // ADD for 一天内尝试多次绑车限制 by shen_kang 20170828 start
        /** 查询同一手机号当天尝试绑定的车架号 */
        public static final String SQL_SELECTBINDCOUNTBYTELNO_001 = "sql.selectBindCountByTelNo.001";
        /** 查询同一车架号当天尝试的发动机号 */
        public static final String SQL_SELECTENGINENOCOUNTBYVINNO_001 = "sql.selectEngineNoCountByVinNo.001";
        /** 绑车信息插入到绑车log表中 */
        public static final String SQL_INSERTVEHICLEBINDLOG_001 = "sql.insertVehicleBindLog.001";
        /** 查询车辆当天解绑次数 */
        public static final String SQL_SELECTUNBINDCNTATNOWDAY_001 = "sql.selectUnbindCntAtNowDay.001";
        /** 查询用户手机号 */
        public static final String SQL_SELECTTELNOBYGTMC_001 = "sql.selectTelNoByGtmc.001";
        // ADD for 一天内尝试多次绑车限制 by shen_kang 20170828 end
        // ADD for 全新汉兰达车主关怀活动领券接口 by shen_kang 20170901 start
        /** 查询用户是否已注册 */
        public static final String SQL_SELECTUSERISEXIST_001 = "sql.selectUserIsExist.001";
        /** 查询用户车辆信息 */
        public static final String SQL_SELECTUSERCARFORHLD_001 = "sql.selectUserCarForHLD.001";
        /** 查询车辆是否已领取过优惠券 */
        public static final String SQL_SELECTISRECEIVED_001 = "sql.selectIsReceived.001";
        /** 查询未被发放的优惠券 */
        public static final String SQL_SELECTCOUPONIDBYWXCOUPFORHLD_001 = "sql.selectCouponIdByWxCoupForHLD.001";
        /** 将优惠券与用户进行绑定 */
        public static final String SQL_UPDATEWXCOUPFORHLD_001 = "sql.updateWxCoupForHLD.001";
        /** 保存用户领券信息 */
        public static final String SQL_INSERTHLDRECEIVE_001 = "sql.insertHLDReceive.001";
        /** 更新短信状态 */
        public static final String SQL_UPDATEHLDRECEIVE_001 = "sql.updateHLDReceive.001";
        /** 查询微信优惠券信息 */
        public static final String SQL_SELECTHLDWXCOUPON_001 = "sql.selectHLDWxCoupon.001";
        // ADD for 全新汉兰达车主关怀活动领券接口 by shen_kang 20170901 end
        // add for APP售后优惠券限定车型 限定销售店 by shen_kang 20170913 start
        /** 根据券码查询车型销售店限制 */
        public static final String SQL_SELECTASTRICTBYCOUPONID_001 = "sql.selectAstrictByCouponId.001";
        /** 查询规则 */
        public static final String SQL_SELECTRULEBYMODEL_001 = "sql.selectRuleByModel.001";
        /** 插入规则 */
        public static final String SQL_INSERTRULEFORAPP_001 = "sql.insertRuleForApp.001";
        /** 更新规则 */
        public static final String SQL_UPDATERULEFORAPP_001 = "sql.updateRuleForApp.001";
        /** 根据工单查询车型信息 */
        public static final String SQL_SELECTVHCCODEBYORDER_001 = "sql.selectVhcCodeByOrder.001";
        // add for APP售后优惠券限定车型 限定销售店 by shen_kang 20170913 end

        // Add for 车辆上下工位状态同步接口 by liangxiao 20170914 start
        /** 根据车牌号获取维修工单信息 */
        public static final String SQL_SELECT_TACT_SRV_ORDER_001 = "sql.selectTactSrvOrder.001";

        /** 新规车辆上下工位状态同步信息 */
        public static final String SQL_INSERT_MAINTENANCE_CAR_STATUS_INFO_001 = "sql.InsertMaintnenceCarStatusInfo.001";

        /** 根据工位编号和销售店编号获取工位信息 */
        public static final String SQL_SELECT_STALLID_STATUS_INFO_001 = "sql.selectStallIdStatusInfo.001";

        /** 添加工位信息到工位信息 */
        public static final String SQL_INSERT_CAR_STATUS_INFO_001 = "sql.insertCarStatusInfo.001";

        /** 更新工位状态 */
        public static final String SQL_UPDATE_CAR_STATUS_INFO_001 = "sql.updateCarStatusInfo.001";

        /** 更新工位状态 */
        public static final String SQL_UPDATE_CAR_STATUS_INFO_IN_001 = "sql.updateCarStatusInInfo.001";

        /** 查询摄像头信息 */
        public static final String SQL_SELECT_CAMERA_INFO_001 = "sql.selectCameraInfo.001";

        // Add for 车辆上下工位状态同步接口 by liangxiao 20170914 end

        // Add for 微信用户信息验证接口 by lu_chuanchuan 20170918 start
        /** 查询微信用户的统合ID */
        public static final String SQL_SELECT_USERWXINFOBYID_001 = "sql.selectUserWxInfoById.001";
        /** 更新微信用户的更新时间 */
        public static final String SQL_UPDATE_USERWXINFO_001 = "sql.updateUserWxInfo.001";
        // Add for 微信用户信息验证接口 by lu_chuanchuan 20170918 end

        // Add for 微信用户注册绑定 by leikaiwei 20170926 start
        /** 微信用户绑定注册 */
        public static final String SQL_INSERT_USERWXINFO_001 = "sql.insertUserWxInfo.001";
        // Add for 微信用户注册绑定 by leikaiwei 20170926 end
        // Add for 未激活用户进行激活处理 by liangxiao at 20171227 start
        // 获取用户的激活状态
        public static final String SQL_GETACTIVEFLAG_001 = "sql.getActiveFlag.001";
        // 更新用户激活状态
        public static final String SQL_UPDATE_ACTIVE_FLAG_002 = "sql.updateActiveFlag.002";
        // 获取已经激活的用户件数
        public static final String SQL_GET_ACTIVE_COUNT_002 = "sql.getActiveCount.002";
        // Add for 未激活用户进行激活处理 by liangxiao at 20171227 end

        // Add for 验证用户注册绑定 by lu_chuanchuan 20171010 start
        /** 根据工单号查询送修者电话 （维修工单信息表） */
        public static final String SQL_SELECT_TACTSRVORDERBYORDERNO = "sql.selectTactSrvOrderByOrderNO.001";
        /** 根据工单号查询送修者电话（工单信息历史表） */
        public static final String SQL_SELECT_KPISRVORDERHISBYORDERNO = "sql.selectKpiSrvOrderHisByOrderNO.001";
        /** 根据openId查询用户是否绑定 */
        public static final String SQL_SELECT_USERWXINFOBYOPENID_001 = "sql.selectUserWxInfoByopenId.001";
        /** 根据openId查询用户的统合ID */
        public static final String SQL_SELECT_USERWXINFOBYOPENID_002 = "sql.selectUserWxInfoByopenId.002";
        /** 根据电话号码查询用户的统合ID */
        public static final String SQL_SELECT_USERLOGINBYTEL_001 = "sql.selectUserLoginByTel.001";
        // Add for 验证用户注册绑定 by lu_chuanchuan 20171010 end
        // add for 查询车辆信息 by shen_kang 20171206 start
        public static final String SQL_SELECTVHCBYENG_001 = "sql.selectVhcByEng.001";
        // add for 查询车辆信息 by shen_kang 20171206 end
        // Add for 车友会优惠劵数据驻留EIP平台 by liangxiao 20171205 start
        /** 查询优惠券件数 */
        public static final String SQL_SELECT_ICLUB_COUPON_CONTENT_COUNT_001 = "sql.selectIclubCouponContentCount.001";
        /** 根据电话号码获取统合管理ID */
        public static final String SQL_SELECT_UID_GTMC_BY_TELNO_001 = "sql.selectUidGtmcByTelNo.001";
        /** 更新车友会优惠券信息 */
        public static final String SQL_UPDATE_ICLUB_COUPON_CONTENT_001 = "sql.updateIclubCouponContent.001";
        /** 添加车友会优惠券信息 */
        public static final String SQL_INSERT_ICLUB_COUPON_CONTENT_001 = "sql.insertIclubCouponContent.001";
        // Add for 车友会优惠劵数据驻留EIP平台 by liangxiao 20171205 end

        // Add for 售后优惠券查询 by lu_chuanchuan 20171212 start
        /** 根据车架号查询用户统合管理ID */
        public static final String SQL_SELECT_USER_CAR_BY_VINNO_001 = "sql.selectUserCarByVinNo.001";
        /** 根据用户Id和销售店代码查询厂商和销售店发行的未使用未过期的优惠券 */
        public static final String SQL_SELECT_CVM_COUPON_BY_OPENIDANDDEALERCODE_001 = "sql.selectCvmCouponByOpenIdAndDealerCode.001";
        /** 根据优惠券组ID查询当前优惠券的限用车型 */
        public static final String SQL_SELECT_APP_COUPON_BATCH_CONTENT_BY_GROUPID_001 = "sql.selectAppCouponBatchContentByGroupId.001";
        /** 根据优惠券组ID查询当前优惠券的限用店 */
        public static final String SQL_SELECT_APP_COUPON_BATCH_CONTENT_BY_GROUPID_002 = "sql.selectAppCouponBatchContentByGroupId.002";
        /** 根据车名代码和等级代码查找当前车型的名称 */
        public static final String SQL_SELECT_BASE_VEHICLE_MODEL_BY_VHCNAMEANDGRADE_001 = "sql.selectBaseVehicleModelByCode.001";
        /** 根据活动Id查询电商优惠券的限用车型 */
        public static final String SQL_SELECT_BASE_COUPON_RULE_BY_EVENTID_001 = "sql.selectBaseCouponRuleByEventId.001";
        /** 根据车型代码查询当前车型的名称 */
        public static final String SQL_SELECT_BASE_VHICLE_MODEL_BY_VHCNAME_001 = "sql.selectBaseVhicleModelByCode.002";
        // Add for 售后优惠券查询 by lu_chuanchuan 20171212 end

        // Add for CSI调研积分获取 by liangxiao at 20171219 start
        // 查找已激活的会员件数
        public static final String SQL_SELECT_USER_INFO_001 = "sql.selectUserInfo.001";
        // 查找电话号与工单号匹配的件数
        public static final String SQL_SELECT_SRV_ORDER_001 = "sql.selectSrvOrder.001";
        // 根据车架号和工单号查询工单信息件数
        public static final String SQL_SELECT_VINNO_ORDERNO_001 = "sql.selectVinnoOrderno.001";
        // 查询该工单之前是否已经发送过积分
        public static final String SQL_SELECT_SEND_CSI_POINT_LIST_001 = "sql.selectSendCSIPointList.001";
        // 获取用户核心信息数据
        public static final String SQL_GET_USER_CORE_001 = "sql.selectUserCore.001";
        // 根据电话号和工单号获取用户订单信息
        // 工单表中的件数
        public static final String SQL_GET_ORDERNO_BY_TELNO_001 = "sql.selectOrdernoByTelno.001";
        // 工单履历表中的件数
        public static final String SQL_GET_ORDERNO_BY_TELNO_002 = "sql.selectOrdernoByTelno.002";
        // 获取会员核心信息变更履历
        public static final String SQL_GET_USER_CORE_CHG_HIS_001 = "sql.selectUserCoreChgHis.001";
        // Add for CSI调研积分获取 by liangxiao at 20171219 end

        // add for 微信用户注册与绑定接口增加验证 by shen_kang 20171222 start
        /** 根据手机号查询该用户是否已存在 */
        public static final String SQL_SELECTNRPCSIKPIPER_001 = "sql.selectNrpCsiKpiPer.001";
        // add for 微信用户注册与绑定接口增加验证 by shen_kang 20171222 end

        // add for 获取用户最终交车日 by lu_chuanchuan 20180102 start
        /** 根据车架号查询用户的最终交车日 */
        public static final String SQL_GET_DELIVERYENDDATE_BY_VINNO_001 = "sql.selectDeliveryEndDateByVinNo.001";
        // add for 获取用户最终交车日 by lu_chuanchuan 20180102 end

        // add for 获取用户新车订单信息 by lu_chuanchuan 20180110 start
        /** 根据电话查询用户新车订单备份表中的信息 */
        public static final String SQL_GET_TACTORDERVEHICLEBK_BY_TEL_001 = "sql.selectTactOrderVehicleBKByTel.001";
        // add for 获取用户新车订单信息 by lu_chuanchuan 20180110 end
        // add for 车友会雨刮片活动相关 by shen_kang 20180112 start
        /** 根据卷码查询雨刮片 */
        public static final String SQL_SELECTWIPERCOUPON_001 = "sql.selectWiperCoupon.001";
        /** 插入滤清器优惠卷 */
        public static final String SQL_INSERTNEWCOUPON_001 = "sql.insertNewCoupon.001";
        /** 查询卷码是否重复 */
        public static final String SQL_SELECTISEXISTBYNEWCOUPONID_001 = "sql.selectIsExistByNewCouponId.001";
        /** 保存领券记录 */
        public static final String SQL_INSERTNEWCOUPONRE_001 = "sql.insertNewCouponRe.001";
        /** 查询用户信息 */
        public static final String SQL_SELECTUSERLOGINBYCOUPONID_001 = "sql.selectUserLoginByCouponId.001";
        /** 更新短信发送状态 */
        public static final String SQL_UPDATENEWCOUPONRE_001 = "sql.updateNewCouponRE.001";
        /**查询是否已经领取过滤清卷*/
        public static final String SQL_SELECTISREWIPER_001="sql.selectIsReWiper.001";
        // add for 车友会雨刮片活动相关 by shen_kang 20180112 end
    }

    /** 资源文件 */
    public interface ResourceFile {
        // 20170531 Litao add start
        /** MQ server */
        public static final String MQ_SERVER = "MqServer";
        // 20170531 Litao add end

        /** properties文件名 */
        public static final String PRO_SYSTEM_NM = "gtmc";

        /** log level */
        public static final String LOG_LEVEL = "sql.Log.Level";

        /** sql timeout */
        public static final String SQL_TIMEOUT = "sql.allow.timeout";

        /** IF连接 timeout */
        public static final String IF_TIMEOUT = "if.allow.timeout";

        /** JNDI */
        public static final String JNDI_NAME = "jndi.name.db";

        /** properties文件名 */
        public static final String PRO_SQL_NM = "sql";

        /** properties文件名 */
        public static final String PRO_MESSAGE_NM = "message";

        /** properties文件名 */
        public static final String SERVICE_URL = "serviceURL";

        /** 养护学堂课程信息 URL */
        public static final String URL_IF0001 = "getCCCInfo";

        /** 养护学堂开课信息 URL */
        public static final String URL_IF0002 = "getStartInfo";

        /** 养护学堂图片信息 URL */
        public static final String URL_IF0003 = "getImageInfo";

        /** 养护学堂课程图片关系信息URL */
        public static final String URL_IF0004 = "getClassImageRelationship";

        /** 养护学堂课程报名人数URL */
        public static final String URL_IF0005 = "getRegisteredNumber";

        /** 养护学堂课程报名URL */
        public static final String URL_IF0006 = "setCCCApply";

        /** 养护学堂课程签到URL */
        public static final String URL_IF0007 = "getCCCSign";

        /** 预约申请 */
        public static final String URL_IF0010 = "sendApply";

        /** 预约取消申请URL */
        public static final String URL_IF0012 = "sendApplyCancel";

        /** 维修保养工单信息评价信息发送 */
        public static final String URL_IF0015 = "sendEvaluateInfo";

        /** 活动码状态变更 */
        public static final String URL_IF0023 = "getActivityNoStatus";

        /** 优惠券调用 */
        public static final String URL_IF0034 = "getCoupveriInfo";

        /** 优惠券使用（绑定工单号） */
        public static final String URL_IF0035 = "getCoupBindResult";

        /** 优惠券核销（结算） */
        public static final String URL_IF0036 = "getCoupVeriResult";

        /** 微信优惠券调用、优惠券使用（绑定工单号）、核销（结算） */
        public static final String URL_WCHAT = "getWchat_URL";

        /** 优惠券调用 */
        public static final String URL_IF0037 = "getCouponInfo";

        /** 新车订单作业信息 URL */
        public static final String URL_IF0029 = "getTaskInfo";

        /** 新车订单按揭资料 URL */
        public static final String URL_IF0030 = "getMaterialInfo";

        /** 新车订单按揭资料 URL */
        public static final String URL_IF0025 = "getAppointmentInfo";

        /** 销售店作业时间查询 URL */
        public static final String URL_IF0031 = "getTaskTimeInfo";

        /** 预约交车时间修改上报 URL */
        public static final String URL_IF0032 = "setTaskTime";

        /** 可以预约交车时间 URL */
        public static final String URL_IF0033 = "getUsedTaskTime";

        /** APP车主信息 URL */
        public static final String URL_IF0042 = "sendAppUserInfo";

        // Add for:会员信息同步_账号认证信息同步 peng_nijuan 20161230 start
        /** 账号认证信息同步 URL */
        public static final String URL_IF1013 = "updateUserLoginInfo";
        // Add for:会员信息同步_账号认证信息同步 peng_nijuan 20161230 end

        // Add for:会员信息同步_账号车辆信息同步 peng_nijuan 20161230 start
        /** 账号车辆信息同步 URL */
        public static final String URL_IF1015 = "updateUserCarInfo";
        // Add for:会员信息同步_账号车辆信息同步 peng_nijuan 20161230 end

        // Add for:会员信息同步_账号基本属性信息同步 peng_nijuan 20170102 start
        /** 账号车辆信息同步 URL */
        public static final String URL_IF1014 = "updateUserBaseInfo";
        // Add for:会员信息同步_账号基本属性信息同步 peng_nijuan 20170102 end

        /** APP车辆信息 URL */
        public static final String URL_IF0043 = "sendAppVehicleInfo";

        /** 新车订单提醒 URL */
        public static final String URL_IF0027 = "getNewCarOrdeStatus";

        /** 门店开业时间 */
        public static final String JobStartTime = "svcJobStartTime";

        /** 门店关店时间 */
        public static final String JobEndTime = "svcJobEndTime";

        /** 维修保养工单信息推送 */
        public static final String URL_IF0049 = "maintainOrderInfo";

        /** 维修保养工单信息推送 */
        public static final String URL_IF0050 = "maintainOrderStatus";

        // update 20151203 for 判断优惠券是否为企业号 by zhang_huafang at start

        /** 企业优惠券调用、优惠券使用（绑定工单号）、核销（结算） */
        public static final String URL_BUSINESS = "getBusiness_URL";

        /** 课程信息预约取消推送 */
        public static final String URL_IF0051 = "registerCancel_URL";

        /** 课程信息推送 */
        public static final String URL_IF0052 = "sendLesson_URL";

        /** 课程签到信息推送 */
        public static final String URL_IF0053 = "sendSign_URL";

        // update 20151203 for 判断优惠券是否为企业号 by zhang_huafang at end

        /*
         * *********************************************************** add
         * for:问卷 by wanghao at start
         * ***********************************************************
         */
        /** 问卷平台的问卷列表信息连携到APP */
        public static final String IF0053_URL = "receivePaperList_URL";

        /** APP问卷发放结果连携（日次） */
        public static final String IF0054_URL = "getQuestionnaireSendResult_URL";

        /** 问卷平台接口 */
        public static final String IF0056_URL = "saveQsCouponInfo_URL";
        /*
         * *********************************************************** add
         * for:问卷 by wanghao at end
         * ***********************************************************
         */

        // Add for:预约申请状态推送 xing_lili 20151223 start
        /** 预约申请状态推送 */
        public static final String URL_IF0054 = "appointStatus_URL";
        // Add for:预约申请状态推送 xing_lili 20151223 end

        // Add for:问卷调查 xing_lili 20160524 start
        /** 调用内容管理平台生成二维码接口 */
        public static final String URL_SETQRCODEINFO = "setQrCodeInfo_URL";
        /** 调用内容管理平台二维码扫码接口 */
        public static final String URL_SETQRCODESCANINFO = "setQrCodeScanInfo_URL";
        /** 调用内容管理平台微信红包发放规则接口 */
        public static final String URL_GetRedpacketRule = "getRedpacketRule_URL";
        /** 调用内容管理平台微信红包发放结果同步接口 */
        public static final String URL_SENDREDPACKETRESULT = "sendRedpacket_URL";
        /** 调用微信红包发放规则接口 */
        public static final String URL_WSENDREDPACKETRESULT = "wsendRedpacket_URL";

        // H5地址
        public static final String URL_H5 = "H5Url";
        public static final String NRP_SENDNAME = "nrp_sendName";
        public static final String NRP_WISHING = "nrp_wishing";
        public static final String NRP_ACTNAME = "nrp_actName";
        public static final String NRP_REMARK = "nrp_remark";
        public static final String NRP_TOTALNUM = "nrp_totalNum";
        public static final String NRP_CLIENTIP = "nrp_clientIp";

        // Add for:问卷调查 xing_lili 20160524 end

        // Add for:5月份增改 xing_lili 20160621 start
        /** 调用GTCV试乘试驾预约和取消接口 */
        public static final String URL_DRIVINGAPPINFO = "drivingAppInfo_URL";
        // Add for:5月份增改 xing_lili 20160621 end

        // Modify for:欧洲杯竞猜项目夏季活动 xing_lili 20160706 start
        /** 欧洲杯竞猜项目夏季活动优惠券使用（绑定工单号） */
        public static final String URL_INNERCOUPBIND = "getInnerCoupBindResult_URL";
        /** 欧洲杯竞猜项目夏季活动优惠券调用 */
        public static final String URL_INNERCOUPVERIINFO = "getInnerCoupVeriInfo_URL";
        /** 欧洲杯竞猜项目夏季活动优惠券核销（结算） */
        public static final String URL_INNERCOUPVERIRESULT = "getInnerCoupVeriResult_URL";
        // Modify for:欧洲杯竞猜项目夏季活动 xing_lili 20160706 end

        // Add for App会员积分获取接口 20170102 jiao_jianying start
        // 会员注册
        public static final String AppDefaultPoint = "AppDefPoint";
        // 输入头像
        public static final String AppHadAvatarFlagPoint = "AppHadAvatarFlagPoint";
        // 输入姓名
        public static final String AppHadNamePoint = "AppHadNamePoint";
        // 输入性别
        public static final String AppHadSexPoint = "AppHadSexPoint";
        // 输入生日
        public static final String AppHadBirthdayPoint = "AppHadBirthdayPoint";
        // 绑定销售店
        public static final String AppHadDlrPoint = "AppHadDlrPoint";
        // 绑定车辆
        public static final String AppHadCarPoint = "AppHadCarPoint";
        // 输入地址
        public static final String AppHadAddressPoint = "AppHadAddressPoint";
        // 分享活动
        public static final String AppEventSharePoint = "AppEventSharePoint";
        // 分享课程
        public static final String AppClassSharePoint = "AppClassSharePoint";
        // 分享勋章
        public static final String AppMedalSharePoint = "AppMedalSharePoint";
        // App用户注册时站内信消息标题
        public static final String NEW_USER_TITLE = "newUserTitle";
        // App用户注册时站内信消息文本
        public static final String NEW_USER_CONTENT = "newUserContent";
        // App用户获取积分时站内信消息标题
        public static final String UPDATE_CORE_TITLE = "updateCoreTitle";
        // App用户获取积分时站内信消息文本
        public static final String UPDATE_CORE_CONTENT = "updateCoreContent";
        // App用户获取积分时站内信消息URL
        public static final String UPDATE_CORE_URL = "updateCoreUrl";
        // #等级升级时站内信消息标题
        public static final String UP_RANK_TITLE = "upRankTitle";
        // 等级升级时站内信消息文本
        public static final String UP_RANK_CONTENT = "upRankContent";
        // Add for App会员积分获取接口 20170102 jiao_jianying end
        // Add for:I_Club会员管理 xing_lili 20160321 start
        /** 02-29日期特殊处理（遇到02-29则变为03-01） */
        public static final String RegistDate = "registDate";
        // 默认积分值定义
        public static final String DefaultPoint = "defPoint";
        // 多倍积分定义
        public static final String Level1By2DoublePoint = "point1_0";
        public static final String Level3DoublePoint = "point1_2";
        public static final String Level4DoublePoint = "point1_5";
        public static final String Level5DoublePoint = "point2_0";
        // 等级升级定义
        public static final String Level1By2Exp = "exp800";
        public static final String Level2By3Exp = "exp2000";
        public static final String Level3By4Exp = "exp4000";
        public static final String Level4By5Exp = "exp8000";

        // Modify for:取消多倍积分奖励和晋级奖励积分 xing_lili 20161017 start
        public static final String Level1By2ExpVal = "exp3000"; // UPDATE BY YQ
                                                                // 20170315
                                                                // 等级升级变更
        public static final String Level2By3ExpVal = "exp6000"; // UPDATE BY YQ
                                                                // 20170315
                                                                // 等级升级变更
        // public static final String Level3By4ExpVal = "exp25000"; // UPDATE BY
        // YQ 20170315 等级升级变更
        // public static final String Level4By5ExpVal = "exp60000"; // UPDATE BY
        // YQ 20170315 等级升级变更
        // Modify for:取消多倍积分奖励和晋级奖励积分 xing_lili 20161017 end
        // 升级增加积分定义
        public static final String Level1By2Point = "point300";
        public static final String Level2By3Point = "point500";
        public static final String Level3By4Point = "point800";
        public static final String Level4By5Point = "point1000";

        /** 调用I-club会员手机验证接口 */
        public static final String URL_PhoneValidate = "getPhoneValidate_URL";

        /** 会员积分系统优惠券调用 */
        public static final String URL_ClubPointCoupVeri = "getClubPointCoupVeriInfo_URL";

        /** 会员积分系统优惠券使用（绑定工单号） */
        public static final String URL_ClubPointCoupBind = "getClubPointCoupBindResult_URL";

        /** 会员积分系统优惠券核销（结算） */
        public static final String URL_ClubPointCoupVeriResult = "getClubPointCoupVeriResult_URL";

        /** 调用I-club会员等级升级接口 */
        public static final String URL_SendMsgInfo = "sendMsgInfo_URL";
        // Add for:I_Club会员管理 xing_lili 20160321 end
        // Add for App会员积分获取接口 20170102 jiao_jianying start
        /** 会员积分赠予标识信息查询接口 */
        public static final String URL_getUserPointFlagInfo = "getUserPointFlagInfo_URL";
        /** 会员积分赠予标识信息更新接口 */
        public static final String URL_updateUserPointFlagInfo = "updateUserPointFlagInfo_URL";
        /** ICLUB会员ID取得接口 */
        public static final String URL_getIClubUserInfo = "getIClubUserInfo_URL";
        /** 会员分享履历信息查询接口 */
        public static final String URL_getUserShareHisInfo = "getUserShareHisInfo_URL";
        /** 会员分享履历信息登录接口 */
        public static final String URL_insUserShareHisInfo = "insUserShareHisInfo_URL";
        /** 会员积分同步 */
        public static final String URL_getAppUserCoreInfo = "getAppUserCoreInfo_URL";
        // Add for App员工信息同步接口 20170313 zhang_lei start
        /** 员工信息同步 */
        public static final String URL_gerEmployee = "gerEmployee_URL";
        // Add for App员工信息同步接口 20170313 zhang_lei end
        /** IClub会员电话号码取得 */
        public static final String URL_gerIClubUserTelNo = "gerIClubUserTelNo_URL";
        // Add for App会员积分获取接口 20170102 jiao_jianying end
        // add for iclub2app站内信同步 xie_dandan 20161228 Start
        /** 调用APP站内信同步接口 */
        public static final String URL_getAppInnerMsg = "getAppInnerMsg_URL";
        // add for iclub2app站内信同步 xie_dandan 20161228 end

        // Add for:每次积分变更将积分信息发送到iClub xing_lili 20161018 start
        public static final String URL_SendPointChgInfo = "sendPointChgInfo_URL";
        // 积分变更站内信模板定义
        public static final String TempletMsg = "templetMsg";
        // Add for:每次积分变更将积分信息发送到iClub xing_lili 20161018 end
        // Add for 问卷平台2app答题结果标记同步 20170522 liangxiao start
        /** 问卷平台2app答题结果标记同步 */
        public static final String URL_sendPaperAnswer = "sendPaperAnswer_URL";

        /** APP优惠券领取 */
        public static final String URL_getAppCoupon = "getAppCoupon_URL";

        /** 问卷平台实物券发放 */
        public static final String URL_getH5Coupon = "getH5Coupon_URL";
        // Add for 问卷平台2app答题结果标记同步 20170522 liangxiao end

        // Add for 车辆上下工位状态同步 20170913 liangxiao start
        /** 车辆上下工位状态同步 */
        public static final String URL_sendMaintenanceCarStatusInfo = "sendMaintenanceCarStatusInfo_URL";
        // Add for 车辆上下工位状态同步 20170913 liangxiao end

        // Add for CSI调研积分获取接口 by liangxiao at 20171219 start
        public static final String URL_GetUserInfo = "getUserInfo_URL";
        // Add for CSI调研积分获取接口 by liangxiao at 20171219 end

        /** SMS服务器 */
        public static final String SMS_SERVICE = "smsService";

        /** 消息内容 */
        public static final String SMS_CONTENT = "messageContent";

        /** 动态验证码登录 短信内容 */
        public static final String CODE_SMS_CONTENT = "codemessageContent";

        /** 每个自然月发送短信次数 */
        public static final String MONTH_COUNT = "monthCount";

        /** 每天发送短信次数 */
        public static final String DAY_COUNT = "dayCount";

        /** 10分钟内发送短信次数 */
        public static final String TEN_MINUTE_COUNT = "tenMinuteCount";

        /** 失败信息取得 */
        public static final String SMS_CONTENT_ERROR = "messageErrorContent";

        /** 销售店代码 */
        public static final String STR_DEALER_CODE_LIST = "dealerCodeList";

        /** 一个月最大发送次数 */
        public static final String SEND_MONTH_COUNT_MAX = "sendMonthCountMax";

        /** 一天最大发送次数 */
        public static final String SEND_DAY_COUNT_MAX = "sendDayCountMax";

        /** 发送期间开始日 */
        public static final String SEND_START_DATE = "sendStartDate";

        /** 发送期间结束日 */
        public static final String SEND_END_DATE = "sendEndDate";

        /** 月度定义天数：30 */
        public static final String MONTH_DAYS = "monthDays";

        /** 屏蔽得销售店号：41J10 */
        public static final String MASKI_DEALER_CODE = "maskiDealerCode";
        /** APP屏蔽得销售店号 */
        public static final String MASKI_DEALER_CODE_LIST = "maskiDealerCodeList";

        // **************TMTS ADD START*******************
        /** APP激活动作 */
        public static final String ACTIONKBN0 = "actionKbn0";
        /** APP会员激活发送站内信的标题 */
        public static final String INNER_MSG_TITLE0 = "InnerMsgTitle0";
        /** APP会员激活发送站内信的内容 */
        public static final String INNER_MSG_CONTENTVAL0 = "InnerMsgContentVal0";
        /** APP会员激活发送站内信的消息路径 */
        public static final String INNER_MSG_MESSAGEURL0 = "InnerMsgMessageUrl0";
        // **************TMTS ADD END *******************

        // Add for 养车无忧优惠券领取 20170523 zhanglei start
        /** 养车无忧优惠券领取 */
        public static final String CVM_BIND_MSG = "cvmBindMsgContentVal0";
        // Add for 养车无忧优惠券领取 20170523 zhanglei end

        /** 调用i-CLUB晋级礼包领取接口 */
        public static final String URL_GETRANKUPGIFT_URL = "getRankUpGift_URL";
        /** 调用i-CLUB模板消息内容查询接口 */
        public static final String URL_GETTEMPLETMSGINFO_URL = "getTempletMsgInfo_URL";

        /** 临时工单信息保留天数 */
        public static final String ORDER_DAYS = "orderDays";

        // Add for 保养无忧优惠券生成 20170609 shen_kang start
        /** 短信内容 */
        public static final String CVM_RECEIVE_MSG = "cvmReceiveMsg";
        /** 自定义券使用说明 */
        public static final String ASEKEY = "aesKey";
        // Add for 保养无忧优惠券生成 20170609 shen_kang end

        // Add for 售后夏季服务活动优惠券发放 20170627 shen_kang start
        /** 短信内容（已注册） */
        public static final String CUSTSUMMERMSG = "custSummerMsg";
        /** 短信内容（新注册） */
        public static final String CUSTSUMMERNEWMSG = "custSummerNewMsg";

        /** iclub自动注册接口的调用 */
        public static final String AUTOREGISTUSER_URL = "AutoRegistUser_URL";
        // Add for 售后夏季服务活动优惠券发放 20170627 shen_kang end
        // add for 全新汉兰达活动短信内容 20170901 shen_kang start
        /** 全新汉兰达活动短信内容 */
        public static final String HLDMSG = "HLDMsg";
        /** 全新汉兰达活动活动开始日 */
        public static final String HLDBEGINTIME = "HLDBeginTime";
        /** 全新汉兰达活动活动结束日 */
        public static final String HLDENDTIME = "HLDEndTime";
        // add for 全新汉兰达活动短信内容 20170901 shen_kang end
        // add for 邀约短信内容与这顶销售店 by shen_kang 20170927 start
        /** 邀约短信 */
        public static final String INVITEMSG = "inviteMsg";
        /** 指定销售店 */
        public static final String INVITEDLR = "inviteDlr";

        // add for 邀约短信内容与这顶销售店 by shen_kang 20170927 end
        
        // add for 雨刮片活动 by shen_kang 20180115 start
        /** 雨刮片活动领券通知短信 */
        public static final String WIPERMSG = "WiperMsg";
        // add for 雨刮片活动 by shen_kang 20180115 start
        /** URL */
        public static final String URL = "url";

        /** USER_NAME */
        public static final String USER_NAME = "userName";

        /** PASSWORD */
        public static final String PASSWORD = "password";
    }

    /** message ID */
    public interface MessageId {

        /** I_S_10000 处理正常（10000） */
        public static final String I_S_10000 = "I_S_10000";

        /** I_S_10001 没有正常连接（10001） */
        public static final String I_S_10001 = "I_S_10001";

        /** I_S_10002 没有正常连接（10002） */
        public static final String I_S_10002 = "I_S_10002";

        /** I_S_10003 输入参数不正确（10003） */
        public static final String I_S_10003 = "I_S_10003";

        /** E_S_10005 输入参数中1%的格式不正确（10005） */
        public static final String E_S_10005 = "E_S_10005";

        /** E_S_10006 输入参数中1%的长度不正确（10006） */
        public static final String E_S_10006 = "E_S_10006";

        /** E_S_10007 协议号和增量时间戳均未设定（10007） */
        public static final String E_S_10007 = "E_S_10007";

        /** E_S_10009 第%1条数据的输入参数中%2的长度不正确（10009） */
        public static final String E_S_10009 = "E_S_10009";

        /** E_S_99999 系统异常（10004） */
        public static final String E_S_99999 = "E_S_99999";

        /** E_S_10010 用户已注册（10010） */
        public static final String E_S_10010 = "E_S_10010";

        /** E_S_10011 已经超过了登录次数（10011） */
        public static final String E_S_10011 = "E_S_10011";

        /** E_S_10012 登录失败（10012） */
        public static final String E_S_10012 = "E_S_10012";

        /** E_S_10013 账户锁定（10013） */
        public static final String E_S_10013 = "E_S_10013";
        // Add for:销售_优惠券核销 xie 20161213 start
        /** E_S_10014 优惠券1%数据不存在（10014） */
        public static final String E_S_10014 = "E_S_10014";

        /** E_S_10015 优惠券1%更新失败（10015） */
        public static final String E_S_10015 = "E_S_10015";
        // Add for:销售_优惠券核销 xie 20161213 end

        /** E_S_10016 用户不存在（10016） */
        public static final String E_S_10016 = "E_S_10016";
        /** E_S_10017 优惠券已绑定（10017） */
        public static final String E_S_10017 = "E_S_10017";
        /** E_S_10018 优惠券已核销（10018） */
        public static final String E_S_10018 = "E_S_10018";
        /** E_S_10019 优惠券已核销（10019） */
        public static final String E_S_10019 = "E_S_10019";
        /** 券类型不可用 */
        public static final String I_S_10006 = "I_S_10006";
        /** 指定车型可用 */
        public static final String I_S_10007 = "I_S_10007";
        /** 服务信息（全国是否可用） */
        public static final String I_S_10008 = "I_S_10008";
        /** 服务信息（新车购买可用） */
        public static final String I_S_10009 = "I_S_10009";
        /** 活动信息（有效期） */
        public static final String I_S_10010 = "I_S_10010";
        /** 优惠券限定以下地域可用(区域，省，市) */
        public static final String I_S_10011 = "I_S_10011";
        /** 优惠券限定以下销售店可用 */
        public static final String I_S_10017 = "I_S_10017";
        /** 优惠券限定以下销售店不可用 */
        public static final String I_S_10018 = "I_S_10018";
        /** 指定活动期间内一台车可使用几张 */
        public static final String I_S_10019 = "I_S_10019";
        /** 用户注册成功 */
        public static final String E_S_10020 = "E_S_10020";
        /** 用户登录成功 */
        public static final String E_S_10021 = "E_S_10021";
        // add for iclub2app站内信同步 xie_dandan 20161228 Start
        /** EIP站内信ID取得失败 */
        public static final String E_S_10022 = "E_S_10022";
        /** EIP站内信保存失败 */
        public static final String E_S_10023 = "E_S_10023";
        /** APP站内信同步失败 */
        public static final String E_S_10024 = "E_S_10024";
        /** EIP站内信同步数据没有查询到 */
        public static final String E_S_10025 = "E_S_10025";
        /** EIP站内信的同步Flg更新失败 */
        public static final String E_S_10026 = "E_S_10026";
        // add for iclub2app站内信同步 xie_dandan 20161228 end

        // add for:1人绑车不超5辆的限定 yuan_yumei 20170111 start
        /** 绑定车辆的用户已超过上限 */
        public static final String E_S_10027 = "E_S_10027";
        /** 车辆信息不存在 */
        public static final String E_S_10028 = "E_S_10028";
        /** 车辆信息存在但手机号码/身份证不匹配 */
        public static final String E_S_10029 = "E_S_10029";
        /** 车辆信息存在、手机号码/身份证匹配 */
        public static final String E_S_10030 = "E_S_10030";
        /** 用户绑车数量超出限制 */
        public static final String E_S_10031 = "E_S_10031";
        // add for:1人绑车不超5辆的限定 yuan_yumei 20170111 end

        // add for:绑车无忧优惠券领取 zhang_lei 20170523 start
        /** 优惠券已领取 */
        public static final String E_S_10032 = "E_S_10032";
        /** 电话号码或者秘钥错误 */
        public static final String E_S_10033 = "E_S_10033";
        // add for:绑车无忧优惠券领取 zhang_lei 20170523 end
        // add by chenyuan 20170605 start
        /** 没有符合条件数据 */
        public static final String E_S_10034 = "E_S_10034";
        // add by chenyuan 20170605 end

        // add by shen_kang 20170811 start
        /** 不是XXX优惠券 */
        public static final String E_S_10035 = "E_S_10035";
        /** 优惠券已过期 */
        public static final String E_S_10036 = "E_S_10036";
        /** 优惠券已被绑定(预购协议号：XXX) */
        public static final String E_S_10037 = "E_S_10037";
        /** 优惠券已核销 */
        public static final String E_S_10038 = "E_S_10038";
        /** 非可用销售店 */
        public static final String E_S_10039 = "E_S_10039";
        /** 优惠券已取消 */
        public static final String E_S_10040 = "E_S_10040";
        /** 优惠券不存在 */
        public static final String E_S_10041 = "E_S_10041";
        /** 同一协议号只能使用XXX张优惠券 */
        public static final String E_S_10042 = "E_S_10042";
        /** 使用金额上限 */
        public static final String E_S_10043 = "E_S_10043";
        /** 不可多张同时使用 */
        public static final String E_S_10044 = "E_S_10044";
        /** 仅限指定销售店使用 */
        public static final String E_S_10045 = "E_S_10045";
        /** 仅限指定车型使用 */
        public static final String E_S_10046 = "E_S_10046";
        /** 无法解绑 */
        public static final String E_S_10047 = "E_S_10047";
        /** 已被核销 */
        public static final String E_S_10048 = "E_S_10048";
        // add by shen_kang 20170811 end

        // add by lu_chuanchuan 20171010 start
        /** 电话与送修者电话不一致 */
        public static final String E_S_10049 = "E_S_10049";
        /** 用户未绑定未注册 */
        public static final String E_S_10050 = "E_S_10050";
        /** 绑定号码不一致 */
        public static final String E_S_10051 = "E_S_10051";
        // add by lu_chuanchuan 20171010 end
        // add for 验证微信用户注册与绑定接口增加验证 by shen_kang 20171222 start
        /** 该号码禁止参与问卷调研 */
        public static final String E_S_10052 = "E_S_10052";
        // add for 验证微信用户注册与绑定接口增加验证 by shen_kang 20171222 end
    }

    /** 結果 */
    public interface Result {

        /** 成功 */
        public static final String SUCESS = "成功";

        /** 失败 */
        public static final String FAIL = "失败";

    }

    /** IF0009 他渠道预约逻辑 是否有预约flg */
    public interface ReservationFlg {

        /** 无预约 */
        public static final String RESERVATION_NOT_EXSIT = "0";

        /** 已预约 */
        public static final String RESERVATION_IS_EXSIT = "1";
    }

    public interface ReturnFlg {
        /** 处理成功 */
        public static final int SUCESS = 10000;

        /** 外部IF连接失败 */
        public static final int FAILD = 10001;

        /** 外部IF连接超时 */
        public static final int OUT_TIME = 10002;

        /** 参数不正确 */
        public static final int INCORRECT_PARAMETER = 10003;

        // add for:数据库中查询不到数据liang_xiao 20170417 start
        /** 查询不到数据 */
        public static final int DATA_NOT_EXSIT = 10004;

        /** 数据更新失败 */
        public static final int UPDATE_FALSE = 10005;

        /** 输入参数长度不正确 */
        public static final int OVERLENGTH_PARAMETER = 10006;

        /** 销售店号不一致 */
        public static final int DEALER_CODE_INEQUALITY = 10007;

        /** 不可多张核销 */
        public static final int COUP_IS_NOT_PARALLEL = 10008;
        // add for:数据库中查询不到数据liang_xiao 20170417 end

        /** 内部处理时异常错误 */
        public static final int EXCEPTION = 99999;

        // add for lu_chuanchuan 20171010 start
        /** 电话与送修者电话不一致 */
        public static final int TEL_INCONFORMITY = 10009;
        /** 用户未绑定未注册 */
        public static final int NOT_REG_BIND = 10010;
        /** 绑定号码不一致 */
        public static final int BIND_TEL_INCONFORMITY = 10011;
        // add for lu_chuanchuan 20171010 end
        // add for 微信用户绑定与验证接口增加手机号验证 by shen_kang 20171222 start
        /** 该号码禁止参与问卷调研 */
        public static final int BARRED_TEL = 10012;
        // add for 微信用户绑定与验证接口增加手机号验证 by shen_kang 20171222 end
    }

    // Add for App会员积分获取接口 20170102 jiao_jianying start
    public interface AppUserPointReturnFlag {
        /** 0:接口调用正常 */
        public static final int SUCESS = 0;
        /** 1：必须入力项目CHECK异常 */
        public static final int PARAMETER_ISEMPTY = 1;
        /** 2：入力项目长度CHECK异常 */
        public static final int PARAMETER_OVERLENGTH = 2;
        /** 4：会员账号认证信息不存在 */
        public static final int USER_NOT_EXIST = 4;
        /** 5：查询积分结果不存在 */
        public static final int USER_POINT_NOT_EXIST = 5;
        /** 6：注册时【会员注册失败】 */
        public static final int USER_CORE_INFO_FAIL = 6;
        /** 7：已获取该操作的积分，不可重复获取 */
        public static final int USER_POINT_HAS_GET = 7;
        /** 8：积分获取失败 */
        public static final int USER_POINT_GET_FAIL = 8;
        /** 9:调用Iclub的会员积分赠予标识信息查询接口异常 */
        public static final int GET_USER_POINT_FLAG_ERROR = 9;
        // Add for 操作区分为0：激活处理时，更新用户激活状态，并同步给APP by liangxiao at 20180105 start
        /** 10：用户激活状态更新失败 */
        public static final int ACTIVATE_FLG_UPDATE_FAIL = 10;
        // Add for 操作区分为0：激活处理时，更新用户激活状态，并同步给APP by liangxiao at 20180105 end
    }

    public interface AppUserPointMessageId {

        /** I_S_10100 处理正常 */
        public static final String I_S_10100 = "I_S_10100";

        /** E_S_10100=参数{0}为必须输入参数 */
        public static final String E_S_10100 = "E_S_10100";

        /** E_S_10101=参数{0}长度CHECK异常 */
        public static final String E_S_10101 = "E_S_10101";

        /** E_S_10102=所属系统CD={0} 并且 手机号码={1} 的用户在【账号认证信息】表中未注册。 */
        public static final String E_S_10102 = "E_S_10102";

        /** E_S_10103=所属系统CD={0} 并且 手机号码={1} 并且 会员ID={2} 的积分查询结果不存在。 */
        public static final String E_S_10103 = "E_S_10103";

        /** E_S_10104=会员注册失败。 */
        public static final String E_S_10104 = "E_S_10104";

        /** E_S_10105=已获取该操作的积分，不可重复获取。 */
        public static final String E_S_10105 = "E_S_10105";

        /** E_S_10106=所属系统CD={0} 并且 会员ID={1} 的会员获取积分{3}失败。 */
        public static final String E_S_10106 = "E_S_10106";
        /** E_S_10107=调用Iclub的会员积分赠予标识信息查询接口异常 */
        public static final String E_S_10107 = "E_S_10107";
        // Add for 操作区分为0：激活处理时，更新用户激活状态，并同步给APP by liangxiao at 20180105 start
        /** E_S_10108=会员激活状态更新失败。 */
        public static final String E_S_10108 = "E_S_10108";
        // Add for 操作区分为0：激活处理时，更新用户激活状态，并同步给APP by liangxiao at 20180105 end
    }
    // Add for App会员积分获取接口 20170102 jiao_jianying end

    // Add for 用户信息同步接口 20170105 peng_nijuan start
    /** ADD FOR PENG 所属系统CD 1：i-CLUB/2：G-CLUB */
    public interface SysCdFlg {
        /** 所属系统CD 1：i-CLUB */
        public static final String SYSCD_ICLUB = "1";

        /** 所属系统CD 2：G-CLUB */
        public static final String SYSCD_GCLUB = "2";

        /** 所属系统CD 3：EB */
        public static final String SYSCD_EB = "3";
    }

    /**
     * @ClassName: SystemCode
     * @Description: 系统识别码
     * @author zhang_lei
     * @date 2017年1月14日 上午10:20:20
     * 
     */
    public interface SystemCode {
        /**
         * @author zhang_lei
         * @Fields APP : 用友app系统标识
         */
        public static final String APP = "001";
        /**
         * @author zhang_lei
         * @Fields iclub : iclub系统标识
         */
        public static final String ICLUB = "011";
        // Add for:电商系统用户信息同步给I-Club by lu_chuanchuan at 20171201 start
        /**
         * @author lu_chuanchuan
         * @Fields EB : 电商系统标识
         */
        public static final String EB = "003";
        // Add for:电商系统用户信息同步给I-Club by lu_chuanchuan at 20171201 end
    }

    public interface UserInfoReturnFlag {
        /** 0:接口调用正常 */
        public static final int SUCESS = 0;
        /** 1：账号认证信息不存在 */
        public static final int USER_LOGIN_NOT_EXIST = 3;
        /** 2：账号基本属性不存在 */
        public static final int USER_BASE_INFO_NOT_EXIST = 4;
        /** 3：账号车辆不存在 */
        public static final int USER_CAR_NOT_EXIST = 5;
    }
    // Add for 用户信息同步接口 20170105 peng_nijuan end

    public interface NewCarReturnFlg {
        /** 处理成功 */
        public static final int SUCESS = 0;

        /** 处理失败 */
        public static final int FAILD = 1;

    }

    // Add for 养车无忧优惠券领取 20170523 zhang_lei start

    public interface CvmReturnFlg {
        /** 领取成功 */
        public static final int SUCESS = 0;

        /** 已领取 */
        public static final int OVER = 1;

        /** 领取失败 */
        public static final int FAILD = 2;

    }
    // Add for 养车无忧优惠券领取 20170523 zhang_lei end

    public interface ICropReturnFlg {
        /** 正常 */
        public static final String SUCESS = "0";

        /** 参数异常 */
        public static final String INCORRECT_PARAMETER = "901";

        /** DB异常 */
        public static final String DB_EXCEPTION = "902";

        /** 其他异常 */
        public static final String OTHER_EXCEPTION = "904";

    }

    public interface DlHrReturnFlg {
        /** 处理成功 */
        public static final String SUCESS = "10011001";

        /** 失败 */
        public static final String FAILD = "10011002";

        /** 其他异常 */
        public static final String OTHER = "10011003";

    }

    /**
     * 
     * 维修保养工单DB状态
     *
     */
    public interface SvcStatus {
        /** 未入库 0 */
        public static final int NOT_IN = 0;

        /** 没有来店 1 */
        public static final int NOT_COME = 1;

        /** 取消 2 */
        public static final int CANCEL = 2;

        /** 等待开工指示 3 */
        public static final int WATITING_ORDER = 3;

        /** 等待开始作业 4 */
        public static final int WATITING_WORK = 4;

        /** 作业中5 */
        public static final int WORKING = 5;

        /** 等待下次作业开始6 */
        public static final int WATITING_NEXT_WORK_START = 6;

        /** 等待洗车7 */
        public static final int WATITING_VEHICLE_CLEAN = 7;

        /** 洗车中 8 */
        public static final int VEHICLE_CLEANING = 8;

        /** 等待检查 9 */
        public static final int WATITING_CHECK = 9;

        /** 检查中 10 */
        public static final int CHECKING = 10;

        /** 保管中 11 */
        public static final int KEEPING = 11;

        /** 等待交车 12 */
        public static final int WATITING_LEAVE_CAR = 12;

        /** 交车完了13 */
        public static final int LEAVE_CAR = 13;

    }

    /**
     * 
     * 维修保养工单返回状态
     *
     */
    public interface SvcReturnStatus {
        /** 没有此状态 */
        public static final int ERROR = 0;

        /** 等待入库 */
        public static final int WAITING_IN = 1;

        /** 作业中 */
        public static final int WORKING = 2;

        /** 等待洗车 */
        public static final int WATITING_VEHICLE_CLEAN = 3;

        /** 洗车中 */
        public static final int VEHICLE_CLEANING = 4;

        /** 交车准备 */
        public static final int PREPARE_LEAVE_CAR = 5;

        /** 等待交车 */
        public static final int WATITING_LEAVE_CAR = 6;

        /** 交车 */
        public static final int LEAVE_CAR = 7;

    }

    /**
     * 
     * 申请预约状态
     *
     */
    public interface ApmReqStatus {
        /** 申请成功 */
        public static final String APPLY_SUCESS = "1";

        /** 申请取消成功 */
        public static final String APPLY_CANCEL_SUCESS = "3";
    }

    /**
     * 
     * 申请预约返回状态
     *
     */
    public interface ReservationResult {
        /** 已预约成功 */
        public static final int APPLY_SUCESS = 1;

        /** 已取消 */
        public static final int APPLY_CANCELED = 2;
    }

    /**
     * 
     * 取消标志
     *
     */
    public interface JobDetailCancelFlg {
        /** 没有取消 */
        public static final String NOT_CANCEL = "0";

        /** 取消 */
        public static final String CANCEL = "1";
    }

    /**
     * 
     * DB删除flag
     *
     */
    public interface DelFlg {
        /** 已删除 */
        public static final String IS_DEL = "1";

        /** 没有删除 */
        public static final String NOT_DEL = "0";
    }

    /**
     * 
     * 激活flag
     *
     */
    public interface ActiveFlg {
        /** 已激活 */
        public static final String IS_ACTIVE = "1";

        /** 没有激活 */
        public static final String NOT_ACTIVE = "0";
    }

    /**
     * 
     * 空闲区分
     *
     */
    public interface IdleType {
        /** 0：空闲日 */
        public static final String FREE_DAY = "0";

        /** 1：休息时间 */
        public static final String OFF_TIME = "1";

        /** 2：工位使用不可 */
        public static final String NOT_USE = "2";

    }

    /**
     * 
     * 表ICROP_STALL使用中flg
     *
     */
    public interface InuseFlg {
        /** 使用中 */
        public static final String IN_USE = "1";

        /** 没有使用 */
        public static final String NOT_USE = "0";
    }

    /**
     * 
     * 表ICROP_STALL_IDLE取消标志
     *
     */
    public interface CancelFlg {
        /** 使用中 */
        public static final String CANCEL = "1";

        /** 没有使用 */
        public static final String NOT_CANCEL = "0";
    }

    /**
     * 
     * 表NRP_BRIBERY_MONEY 红包标志
     *
     */
    public interface RedpacketFlag {
        /** 未预约 */
        public static final String NO_APPLY = "0";

        /** 已预约 */
        public static final String APPLY = "1";

        /** 已发放 */
        public static final String SEND = "2";
    }

    /**
     * 
     * 会员等级定义
     *
     */
    public interface RankLevel {
        /** 等级1 */
        public static final int LEVEL1 = 1;

        /** 等级2 */
        public static final int LEVEL2 = 2;

        /** 等级3 */
        public static final int LEVEL3 = 3;

        /** 等级4 */
        public static final int LEVEL4 = 4;

        /** 等级5 */
        public static final int LEVEL5 = 5;

    }

    /** 调用微信发红包返回结果 */
    public interface WSResult {

        /** 成功 */
        public static final String SUCCESS = "SUCCESS";

        /** 失败 */
        public static final String FAIL = "FAIL";

        public static final String SYSTEMERROR = "SYSTEMERROR";

    }

    public interface LoginReturnFlg {
        /** 处理成功 */
        public static final int OVERFAILCOUNT = 10009;

    }

    /**
     * 优惠劵分类
     */
    public interface CouponKbn {
        /** 1:TACT系统 */
        public static final String COUPON_KBN_TACT = "1";

        /** 2:第三方 */
        public static final String COUPON_KBN_OTHER = "2";
    }

    /**
     * 卡券状态(优惠券状态)
     */
    public interface CouponStatus {
        /** 0：未使用 */
        public static final String COUPON_STATUS_NO_USE = "0";
        /** 1：已过期 */
        public static final String COUPON_STATUS_EXPIRED = "1";
        /** 2：使用中 */
        public static final String COUPON_STATUS_USING = "2";
        /** 3：已使用 */
        public static final String COUPON_STATUS_USED = "3";
        /** 4：非可用销售店 */
        public static final String COUPON_STATUS_NO_SALE = "4";

        // add for 电商优惠券增加已失效状态 by shen_kang start
        /** 5:优惠券已失效(电商专用) */
        public static final String COUPON_STATUS_ABATE = "5";

        /** 6:优惠券已取消(APP专用) */
        public static final String COUPON_STATUS_CANCEL = "6";
        // add for 电商优惠券增加已失效状态 by shen_kang end
    }

    /**
     * 卡券状态(优惠券状态)
     */
    public interface SalesCouponStatus {
        /** 0：未使用 */
        public static final String SALES_COUPON_STATUS_NO_USE = "0";
        /** 1：已过期 */
        public static final String SALES_COUPON_STATUS_EXPIRED = "1";
        /** 2：绑定中 */
        public static final String SALES_COUPON_STATUS_BING = "2";
        /** 3：已使用 */
        public static final String SALES_COUPON_STATUS_USED = "3";
        /** 4：非可用销售店 */
        public static final String SALES_COUPON_STATUS_NO_SALE = "4";
    }

    /**
     * 卡券状态(优惠券状态)
     */
    public interface CouponType {
        /** 9：总长度 */
        public static final int COUPON_LENGTH = 9;
        /** 1701：前四位 */
        public static final String COUPON_BEFOR_STATUS = "1701";
    }

    /**
     * 优惠劵分类
     */
    public interface SalesCouponKbn {
        /** 0:代金券 */
        public static final int COUPON_KBN_CASH = 0;

        /** 1:实物券 */
        public static final int COUPON_KBN_PHYSICAL = 1;

        /** 2:打折券 */
        public static final int COUPON_KBN_DISCOUNT = 2;

        /** 3:指定金额券 */
        public static final int COUPON_KBN_FIX_AMOUNT = 3;
    }

    /**
     * 优惠劵分类名称
     */
    public interface SalesCouponKbnName {
        /** 0:代金券 */
        public static final String COUPON_KBN_NAME_CASH = "代金券";

        /** 1:实物券 */
        public static final String COUPON_KBN_NAME_PHYSICAL = "实物券";

        /** 2:打折券 */
        public static final String COUPON_KBN_NAME_DISCOUNT = "打折券";

        /** 3:指定金额券 */
        public static final String COUPON_KBN_NAME_FIX_AMOUNT = "指定金额券";
    }

    /**
     * 销售优惠券使用规则表 规则一级分类代码
     */
    public interface RuleClassFirst {
        /** 1:券信息 */
        public static final String RULE_CLASS_FIRST_1 = "1";

        /** 2:车辆信息 */
        public static final String RULE_CLASS_FIRST_2 = "2";

        /** 3:服务信息 */
        public static final String RULE_CLASS_FIRST_3 = "3";

        /** 4:活动信息 */
        public static final String RULE_CLASS_FIRST_4 = "4";
    }

    /**
     * 销售优惠券使用规则表 规则二级分类代码
     */
    public interface RuleClassSecond {
        /** 10:代金券 */
        public static final String RULE_CLASS_SECOND_10 = "10";
        /** 11:实物券 */
        public static final String RULE_CLASS_SECOND_11 = "11";
        /** 12:打折券 */
        public static final String RULE_CLASS_SECOND_12 = "12";
        /** 13:指定金额券 */
        public static final String RULE_CLASS_SECOND_13 = "13";
        /** 20:车架号(VIN) */
        public static final String RULE_CLASS_SECOND_20 = "20";
        /** 21:车型 */
        public static final String RULE_CLASS_SECOND_21 = "21";
        /** 22:等级 */
        public static final String RULE_CLASS_SECOND_22 = "22";
        /** 23:排量 */
        public static final String RULE_CLASS_SECOND_23 = "23";
        /** 24:销售价格 */
        public static final String RULE_CLASS_SECOND_24 = "24";
        /** 25:车牌 */
        public static final String RULE_CLASS_SECOND_25 = "25";
        /** 26:公里数 */
        public static final String RULE_CLASS_SECOND_26 = "26";
        /** 27:车龄 */
        public static final String RULE_CLASS_SECOND_27 = "27";
        /** 30:地域 */
        public static final String RULE_CLASS_SECOND_30 = "30";
        /** 31:服务类型 */
        public static final String RULE_CLASS_SECOND_31 = "31";
        /** 40:有效期 */
        public static final String RULE_CLASS_SECOND_40 = "40";
        /** 41:活动内叠加 */
        public static final String RULE_CLASS_SECOND_41 = "41";
        /** 42:活动外叠加 */
        public static final String RULE_CLASS_SECOND_42 = "42";
        /** 43:累计金额 */
        public static final String RULE_CLASS_SECOND_43 = "43";
        /** 44:抵扣金额 */
        public static final String RULE_CLASS_SECOND_44 = "44";
        // add APP销售优惠券 by shen_kang 20170821 start
        /** 45:限制张数 */
        public static final String RULE_CLASS_SECOND_45 = "45";
        /** 45:限制金额 */
        public static final String RULE_CLASS_SECOND_46 = "46";
        // add APP销售优惠券 by shen_kang 20170821 end
    }

    /**
     * 销售优惠券使用规则表 规则项目代码
     */
    public interface RuleCode {
        /** 是否可用代金券 */
        public static final String RULE_CODE_11000001 = "11000001";
        /** 是否可用打折券 */
        public static final String RULE_CODE_11200001 = "11200001";
        /** 是否可用实物券 */
        public static final String RULE_CODE_11100001 = "11100001";
        /** 是否可用指定金额券 */
        public static final String RULE_CODE_11300001 = "11300001";
        /** 指定车架号(1个或多个完整车架号) */
        public static final String RULE_CODE_22000001 = "22000001";
        /** 指定车架号(1个或多个车架号第一位) */
        public static final String RULE_CODE_22000002 = "22000002";
        /** 指定车架号(1个或多个车架号第二位) */
        public static final String RULE_CODE_22000003 = "22000003";
        /** 指定车架号(1个或多个车架号第三位) */
        public static final String RULE_CODE_22000004 = "22000004";
        /** 指定车架号(1个或多个车架号第四位) */
        public static final String RULE_CODE_22000005 = "22000005";
        /** 指定车架号(1个或多个车架号第五位) */
        public static final String RULE_CODE_22000006 = "22000006";
        /** 指定车架号(1个或多个车架号第六位) */
        public static final String RULE_CODE_22000007 = "22000007";
        /** 指定车架号(1个或多个车架号第七位) */
        public static final String RULE_CODE_22000008 = "22000008";
        /** 指定车架号(1个或多个车架号第八位) */
        public static final String RULE_CODE_22000009 = "22000009";
        /** 指定车架号(1个或多个车架号第九位) */
        public static final String RULE_CODE_22000010 = "22000010";
        /** 指定车架号(1个或多个车架号第十位) */
        public static final String RULE_CODE_22000011 = "22000011";
        /** 指定车架号(1个或多个车架号第十一位) */
        public static final String RULE_CODE_22000012 = "22000012";
        /** 指定车架号区间(1个或多个开始顺序号) */
        public static final String RULE_CODE_22000013 = "22000013";
        /** 指定车架号区间(1个或多个结束顺序号) */
        public static final String RULE_CODE_22000014 = "22000014";
        /** 国产车是否可用 */
        public static final String RULE_CODE_22100001 = "22100001";
        /** 进口车是否可用 */
        public static final String RULE_CODE_22100002 = "22100002";
        /** 指定可用车型 */
        public static final String RULE_CODE_22100003 = "22100003";
        /** 指定可用车牌(1个或多个) */
        public static final String RULE_CODE_22500001 = "22500001";
        /** 指定可用车牌(1个或多个关键字) */
        public static final String RULE_CODE_22500002 = "22500002";
        /** 指定不可用车牌(1个或多个) */
        public static final String RULE_CODE_22500003 = "22500003";
        /** 指定不可用车牌(1个或多个关键字) */
        public static final String RULE_CODE_22500004 = "22500004";
        /** 指定可用等级(1个或多个) */
        public static final String RULE_CODE_22200001 = "22200001";
        /** 指定不可用等级(1个或多个) */
        public static final String RULE_CODE_22200002 = "22200002";
        /** 指定可用排量(1个或多个) */
        public static final String RULE_CODE_22300001 = "22300001";
        /** 指定不可用排量(1个或多个) */
        public static final String RULE_CODE_22300002 = "22300002";
        /** 指定可用销售价格下限 */
        public static final String RULE_CODE_22400001 = "22400001";
        /** 指定可用销售价格上限 */
        public static final String RULE_CODE_22400002 = "22400002";
        /** 指定不可用销售价格下限 */
        public static final String RULE_CODE_22400003 = "22400003";
        /** 指定不可用销售价格上限 */
        public static final String RULE_CODE_22400004 = "22400004";
        /** 指定可用公里数下限 */
        public static final String RULE_CODE_22600001 = "22600001";
        /** 指定可用公里数上限 */
        public static final String RULE_CODE_22600002 = "22600002";
        /** 指定不可用公里数下限 */
        public static final String RULE_CODE_22600003 = "22600003";
        /** 指定不可用公里数上限 */
        public static final String RULE_CODE_22600004 = "22600004";
        /** 指定可用车龄下限 */
        public static final String RULE_CODE_22700001 = "22700001";
        /** 指定可用车龄上限 */
        public static final String RULE_CODE_22700002 = "22700002";
        /** 指定不可用车龄下限 */
        public static final String RULE_CODE_22700003 = "22700003";
        /** 指定不可用车龄上限 */
        public static final String RULE_CODE_22700004 = "22700004";
        /** 全国是否可用 */
        public static final String RULE_CODE_33000001 = "33000001";
        /** 指定可用地域(1个或多个) */
        public static final String RULE_CODE_33000002 = "33000002";
        /** 指定不可用地域(1个或多个) */
        public static final String RULE_CODE_33000003 = "33000003";
        /** 指定可用省份(1个或多个) */
        public static final String RULE_CODE_33000004 = "33000004";
        /** 指定不可用省份(1个或多个) */
        public static final String RULE_CODE_33000005 = "33000005";
        /** 指定可用城市(1个或多个) */
        public static final String RULE_CODE_33000006 = "33000006";
        /** 指定不可用城市(1个或多个) */
        public static final String RULE_CODE_33000007 = "33000007";
        /** 指定可用销售店(1个或多个) */
        public static final String RULE_CODE_33000008 = "33000008";
        /** 指定不可用销售店(1个或多个) */
        public static final String RULE_CODE_33000009 = "33000009";
        /** 新车购买是否可用 */
        public static final String RULE_CODE_33100001 = "33100001";
        /** 车辆以旧换新是否可用 */
        public static final String RULE_CODE_33100002 = "33100002";
        /** 指定活动有效开始日(和结束日组合使用) */
        public static final String RULE_CODE_44000001 = "44000001";
        /** 指定活动有效结束日(和开始日组合使用) */
        public static final String RULE_CODE_44000002 = "44000002";
        /** 指定单日内一台车可使用几张 */
        public static final String RULE_CODE_44100001 = "44100001";
        /** 指定活动期间内一台车可使用几张 */
        public static final String RULE_CODE_44100002 = "44100002";
        /** 指定单日内一台车可使用几张 */
        public static final String RULE_CODE_44200001 = "44200001";
        /** 指定活动期间内一台车可使用几张 */
        public static final String RULE_CODE_44200002 = "44200002";
        /** 指定累计金额下限(满xx即可使用) */
        public static final String RULE_CODE_44300001 = "44300001";
        /** 指定抵扣金额上限(最多可抵扣多少) */
        public static final String RULE_CODE_44400001 = "44400001";
        // add app销售优惠券 by shen_kang 20170815 start
        /** APP销售优惠券使用张数上限 */
        public static final String RULE_CODE_44500001 = "44500001";
        /** APP销售优惠券使用金额上限 */
        public static final String RULE_CODE_44600001 = "44600001";
        // add app销售优惠券 by shen_kang 20170815 end
    }

    /**
     * 使用状态(优惠券使用状态)
     */
    public interface useStatus {
        /** 1：使用优惠码 */
        public static final int SALES_COUPON_USE_STATUS_USEING = 1;
        /** 2：解除使用 */
        public static final int SALES_COUPON_USE_STATUS_NO_USE = 2;
    }

    // add for iclub2app站内信同步 xie_dandan 20161228 Start
    /**
     * 结果状态
     */
    public interface InnerMsgReturnFlg {
        /** 接口调用正常 */
        public static final int SUCESS = 0;
        /** 必须入力项目CHECK异常 */
        public static final int NOT_NULL_FAILD = 1;
        /** 入力项目长度CHECK异常 */
        public static final int OVER_LRNGTH_FAILD = 2;
        /** 入力项目格式CHECK异常 */
        public static final int DATE_CHECK_FAILD = 3;
        /** EIP站内信ID取得失败 */
        public static final int GET_ID_FAILD = 4;
        /** EIP站内信保存失败 */
        public static final int EIP_SAVE_FAILD = 5;
        /** APP站内信同步失败 */
        public static final int APP_SYNC_FAILD = 6;
        /** EIP站内信同步数据不存在 */
        public static final int EIP_SYNC_FAILD = 7;
        /** EIP站内信同步Flg更新失败 */
        public static final int EIP_UPDATE_FAILD = 8;
        /** 内部处理时异常错误 */
        public static final int SYSTEM_ERROR = 9;

    }

    // add for iclub2app站内信同步 xie_dandan 20161228 Start
    /** 会员手机验证 2017-01-05 Add */
    public interface MemberPhoneResult {
        /** 0：是会员手机号 */
        public static final int SUCCESS = 0;

        /** 901：送修者名/购车人电话号码不正确 */
        public static final int PHONE_ERROR = 901;
        public static final String PHONE_ErrorMessage = "送修者名/购车人电话号码不正确";

        /** 902：会员电话号码和车辆绑定不正确 */
        public static final int PHONE_BD_ERROR = 902;
        public static final String PHONE_BD_ErrorMessage = "会员电话号码和车辆绑定不正确";

        /** 903：非注册会员 */
        public static final int USER_ERROR = 903;
        public static final String USER_ErrorMessage = "非注册会员";

        /** 1：失败 */
        public static final int ERROR = 1;
    }

    /**
     * 更新用户名
     */
    public interface SysUserName {
        /** 所属系统CD 1：i-CLUB */
        public static final String SYS_NAME_ICLUB = "ICLUB";

        /** 所属系统CD 2：G-CLUB */
        public static final String SYS_NAME_GCLUB = "APP";

        /** 所属系统CD 3：EB */
        public static final String SYS_NAME_EB = "电商";
    }

    /**
     * 礼包区分
     */
    public interface BdayRankupGiftKbn {
        /** 0:生日礼包/1:晋级礼包 */
        public static final String GIFT_KBN_BIRTHDAY = "0";
        /** 0:生日礼包/1:晋级礼包 */
        public static final String GIFT_KBN_RANKUP = "1";
    }

    /**
     * 礼包领取途径区分
     */
    public interface BdayRankupGetKbn {
        /** 0:领取方式/1:寄送方式 */
        public static final String GIFT_KBN_RECEIVE = "0";
        /** 0:领取方式/1:寄送方式 */
        public static final String GIFT_KBN_SEND = "1";
    }

    /**
     * 动态验证码生成及获取
     * 
     * @author wanghao
     */
    public interface GetDynamicCode {
        /** 动态验证重复获取间隔时间 */
        public static final long SYS_DYNAMIC_CODE_TIME = 60;
        /** 短信发送成功 */
        public static final String SYS_DYNAMIC_CODE_10000 = "10000";
        /** 短信发送失败 */
        public static final String SYS_DYNAMIC_CODE_10001 = "10001";
        /** 已发送短信验证码 */
        public static final String SYS_DYNAMIC_CODE_10002 = "10002";
        /** 参数错误 */
        public static final String SYS_DYNAMIC_CODE_10003 = "10003";
        /** 系统内部异常 */
        public static final String SYS_DYNAMIC_CODE_10004 = "10004";
        /** 当月累计次数超过100次 */
        public static final String SYS_DYNAMIC_CODE_10005 = "10005";
        /** 当天累计次数超过10次 */
        public static final String SYS_DYNAMIC_CODE_10006 = "10006";
        /** 10分钟内累计次数超过3次 弹出图片验证码 */
        public static final String SYS_DYNAMIC_CODE_10007 = "10007";
    }

    /**
     * 动态验证码登录
     * 
     * @author wanghao
     */
    public interface GetDynamicCodeLogin {
        /** 验证码过期时间 */
        public static final long SYS_LOGIN_CODE_TIME = 180;
        /** 登录成功 */
        public static final String SYS_LOGIN_CODE_10000 = "10000";
        /** 验证码已过期 */
        public static final String SYS_LOGIN_CODE_10001 = "10001";
        /** 验证码不正确 */
        public static final String SYS_LOGIN_CODE_10002 = "10002";
        /** 参数错误 */
        public static final String SYS_LOGIN_CODE_10003 = "10003";
        /** 系统内部异常 */
        public static final String SYS_LOGIN_CODE_10004 = "10004";
        /** 新用户注册失败 */
        public static final String SYS_LOGIN_CODE_10005 = "10005";
    }

    /**
     * 销售优惠
     * 
     * @author wanghao
     */
    public interface CreateEBSalesCoupon {
        /** 优惠券码长度 */
        public static final int COUPON_CODE_LENGTH = 5;
        /** 优惠券固定码 */
        public static final String CONSTANT_CODE = "1701";
        /** 成功 */
        public static final int SUCCESS = 0;
        /** 失败 */
        public static final int FAIL = 1;
        /** 参数错误 */
        public static final int ERROR = 3;
        /** 系统异常 */
        public static final int ABNORMAL = 2;
        /** 最大生成数超出 */
        public static final int BIG_GENERATE_COUNT = 4;

        /** 成功 */
        public static final String SUCCESS_MSG = "成功";
        /** 失败 */
        public static final String FAIL_MSG = "失败";
        /** 优惠券规则代码错误 */
        public static final String ERROR_MSG = "优惠券规则代码错误";
        /** 系统异常 */
        public static final String ABNORMAL_MSG = "系统异常";
        /** 最大生成数超出 */
        public static final String BIG_GENERATE_COUNT_MSG = "最大生成数超出,最大10万条";
    }

    // Add for 电商优惠券接口 20170413 liang_xiao start
    public interface InvalidateEBSalesCoupon {
        /** 优惠券常量 */
        public static final int COUPON = 60000;

        /** APP活动Id */
        public static final int APPEVENTID = 44444;
    }
    // Add for 电商优惠券接口 20170413 liang_xiao end

    /**
     * 会员等级名称
     *
     */
    public interface RankName {
        /** 等级1 */
        public static final String LEVEL1_NAME = "普卡";
        /** 等级2 */
        public static final String LEVEL2_NAME = "金卡";
        /** 等级3 */
        public static final String LEVEL3_NAME = "白金卡";
    }

    public interface TempletId {
        /** 消息模板ID: 56 */
        public static final String TEMPLET_ID_56 = "56";
    }

    // add for 优惠券区分 by shen_kang 20170703 start
    /**
     * 优惠券区分
     * 
     * @author shen_kang
     *
     */
    public interface CouponDistinguish {
        /** 保养无忧优惠券 */
        public static final int CVM_COUPON = 0;

        /** 售后夏季服务优惠券 */
        public static final int SUMMER_COUPON = 1;

        /** 会员积分系统优惠券 */
        public static final int ICLUB_COUPON = 2;

        /** app优惠券 */
        public static final int APP_COUPON = 3;

        /** 电商优惠券 */
        public static final int DIAN_COUPON = 4;

        // add for 全新汉兰达优惠券核销 by liangxiao 20170831 start
        /** 全新汉兰达活动优惠券 */
        public static final int NEW_HLD_COUPON = 5;
        // add for 全新汉兰达优惠券核销 by liangxiao 20170831 end
        
        // add for 雨刮片活动滤清优惠券 by shen_kang 20180115 start
        /** 雨刮片优惠券 */
        public static final int WIPER_COUPON = 6;
        // add for 雨刮片活动滤清优惠券 by shen_kang 20180115 end
    }

    // add for 优惠券区分 by shen_kang 20170703 end
    // add for 销售优惠券区分 by shen_kang 20170811 start
    /**
     * 
     * @author Hoperun
     *
     */
    public interface SalesCouponDist {
        /** 电商优惠券 */
        public static final int DIAN_SALESCOUP = 0;
        /** APP优惠券 */
        public static final int APP_SALESCOUP = 1;
    }

    // add for 销售优惠券区分 by shen_kang 20170811 end
    // add for APP优惠券规则CODE by shen_kang 20170919 start
    public interface AppCouponRuleCode {
        /** 是否允许多次绑定 */
        public static final String ISPARALLEL = "01-001";
        /** 限用车型 */
        public static final String VHCCODE = "01-002";
        /** 限用销售店 */
        public static final String DEALERCODE = "01-003";
    }

    // add for APP优惠券规则CODE by shen_kang 20170919 end
    // add for 自动注册推荐源区分 by shen_kang 20180104 start
    public interface RegistFromType {
        /** 电商&全新汉兰达活动 */
        public static final String DIAN_HLD = "13";
        /** 微信用户绑定与注册 */
        public static final String WX_BIND = "13";
        /** 售后夏季服务 */
        public static final String CUST_SUMMER = "13";
    }
    // add for 自动注册推荐源区分 by shen_kang 20180104 end
    
    // add for 各活动参数相关 by shen_kang 20180116 start
    public interface EventDetail{
        /** 雨刮片活动滤清器优惠券活动ID */
        public static final String WIPER_EVENTID = "30004";
        /** 雨刮片活动滤清器优惠券批次号 */
        public static final String WIPER_BATCHID = "30004";
        
    }
    // add for 各活动参数相关 by shen_kang 20180116 end
}
