package com.englishpremierleague.englishpremierleague;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnglishPremierLeagueController {
@GetMapping("/league")
    public String league(Model model) {

    model.addAttribute(
            "team1", new EnglishPremierLeague(
                    1, "Manchester City", 30, 22, 4, 4, 65, 20, 45, 70
            )
    );
    model.addAttribute(
            "team2", new EnglishPremierLeague(
                    2, "Liverpool", 30, 20, 6, 4, 60, 25, 35, 66
            )
    );
    model.addAttribute(
            "team3", new EnglishPremierLeague(
                    3, "Chelsea", 30, 18, 7, 5, 55, 30, 25, 61
            )
    );
    model.addAttribute(
            "team4", new EnglishPremierLeague(
                    4, "Manchester United", 30, 17, 8, 5, 50, 30, 20, 59
            )
    );
    model.addAttribute(
            "team5", new EnglishPremierLeague(
                    5, "Arsenal", 30, 16, 9, 5, 45, 30, 15, 57
            )
    );
    model.addAttribute(
            "team6", new EnglishPremierLeague(
                    6, "Tottenham Hotspur", 30, 15, 8, 7, 40, 35, 5, 53
            )
    );
    model.addAttribute(
            "team7", new EnglishPremierLeague(
                    7, "Leicester City", 30, 14, 9, 7, 38, 35, 3, 51
            )
    );
    model.addAttribute(
            "team8", new EnglishPremierLeague(
                    8, "West Ham United", 30, 13, 10, 7, 35, 35, 0, 49
            )
    );
    model.addAttribute(
            "team9", new EnglishPremierLeague(
                    9, "Wolverhampton Wanderers", 30, 12, 9, 9, 30, 35, -5, 45
            )
    );
    model.addAttribute(
            "team10", new EnglishPremierLeague(
                    10, "Everton", 30, 11, 8, 11, 28, 35, -7, 41
            )
    );
    model.addAttribute(
            "team11", new EnglishPremierLeague(
                    11, "Aston Villa", 30, 10, 10, 10, 25, 35, -10, 40
            )
    );
    model.addAttribute(
            "team12", new EnglishPremierLeague(
                    12, "Leeds United", 30, 9, 8, 13, 22, 40, -18, 35
            )
    );
    model.addAttribute(
            "team13", new EnglishPremierLeague(
                    13, "Southampton", 30, 8, 6, 16, 20, 45, -25, 30
            )
    );
    model.addAttribute(
            "team14", new EnglishPremierLeague(
                    14, "Crystal Palace", 30, 6, 7, 17, 15, 50, -35, 25
            )
    );
    model.addAttribute(
            "team15", new EnglishPremierLeague(
                    15, "Newcastle United", 30, 5, 9, 16, 12, 55, -43, 24
            )
    );
    model.addAttribute(
            "team16", new EnglishPremierLeague(
                    16, "Brighton & Hove Albion", 30, 4, 8, 18, 10, 60, -50, 20
            )
    );
    model.addAttribute(
            "team17", new EnglishPremierLeague(
                    17, "Burnley", 30, 3, 10, 17, 8, 65, -57, 19
            )
    );
    model.addAttribute(
            "team18", new EnglishPremierLeague(
                    18, "Fulham", 30, 2, 6, 22, 5, 70, -65, 12
            )
    );


        return "league";
    }


}
