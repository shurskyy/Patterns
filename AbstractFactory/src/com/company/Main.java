package com.company;

import com.company.PeremogaNews.Peremoga;
import com.company.ZradaNews.Zrada;

public class Main {

    public static void main(String[] args) {
        NewsFactory zradaFactory = TvNewsFactory.getFactory("Zrada");
        Zrada zradaNewsOne = zradaFactory.generateZrada("PutinWillAttack");
        zradaNewsOne.accuse();

        Zrada zradaNews2 = zradaFactory.generateZrada("FindScapegoat");
        zradaNews2.accuse();

        NewsFactory peremogaFactory = TvNewsFactory.getFactory("Peremoga");
        Peremoga peremogaNewsOne = peremogaFactory.generatePeremoga("Visa");
        peremogaNewsOne.promise();

        Peremoga peremogaNews2 = peremogaFactory.generatePeremoga("Improvement");
        peremogaNews2.promise();

    }
}
