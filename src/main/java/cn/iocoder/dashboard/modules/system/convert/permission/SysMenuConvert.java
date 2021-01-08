package cn.iocoder.dashboard.modules.system.convert.permission;

import cn.iocoder.dashboard.modules.system.controller.permission.vo.SysMenuCreateReqVO;
import cn.iocoder.dashboard.modules.system.controller.permission.vo.SysMenuRespVO;
import cn.iocoder.dashboard.modules.system.controller.permission.vo.SysMenuUpdateReqVO;
import cn.iocoder.dashboard.modules.system.dal.mysql.dataobject.permission.SysMenuDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SysMenuConvert {

    SysMenuConvert INSTANCE = Mappers.getMapper(SysMenuConvert.class);

    List<SysMenuRespVO> convertList(List<SysMenuDO> list);

    SysMenuDO convert(SysMenuCreateReqVO bean);

    SysMenuDO convert(SysMenuUpdateReqVO bean);

    SysMenuRespVO convert(SysMenuDO bean);

}