package com.google.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.google.model.domain.Team;
import com.google.model.domain.User;
import com.google.model.dto.TeamQuery;
import com.google.model.request.TeamJoinRequest;
import com.google.model.request.TeamQuitRequest;
import com.google.model.request.TeamUpdateRequest;
import com.google.model.vo.TeamUserVO;

import java.util.List;

/**
 * @author Micro
 * @description 针对表【team(队伍)】的数据库操作Service
 * @createDate 2024-05-11 20:06:24
 */
public interface TeamService extends IService<Team> {

    /**
     * 添加队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 用户搜索
     *
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest team, User loginUser);

    /**
     * 加入队伍
     *
     * @param teamJoinRequest
     * @param loginUser
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     *
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 解散队伍
     *
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);
}
