package com.cqupt.jaxws.cxf.ws;

import java.util.List;

import javax.jws.WebService;

import com.cqupt.jaxws.cxf.model.Player;

/**
 * 
 * @author danielme.com
 *
 */
@WebService
public interface ITeamService {

    List<Player> getTeam();

    List<Player> getPlayers(int... numbers);

    boolean updatePlayerByNumber(int number, Player player);

    boolean deletePlayer(int number);

    void foo();
}
