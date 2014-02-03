package com.vedroid.server.dao;

import com.vedroid.server.model.Team;

import java.util.List;

public interface TeamDAO {

    public void addTeam(Team team);

    public void updateTeam(Team team);

    public Team getTeam(int id);

    public void deleteTeam(int id);

    public List<Team> getTeams();

}
