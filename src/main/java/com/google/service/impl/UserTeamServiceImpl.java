package com.google.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.model.domain.UserTeam;
import com.google.service.UserTeamService;
import com.google.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
* @author Micro
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2024-05-11 20:11:48
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService {

}




