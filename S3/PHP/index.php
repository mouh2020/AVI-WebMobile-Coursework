<?php
class Caluclatrice {
    public function additionner($a, $b) {
        return $a + $b;

    }
    public function soustraire($a, $b) {
        return $a - $b;
    }

    public function estPair($a, $b) {
        return $a/2 == 0;
    }

    public function estPositif($a, $b) {
        return $a > 0;
    }
}
echo"\n";
echo"Exo01";
echo"\n";

$caluclatrice = new Caluclatrice();
$resultatAddition = $caluclatrice->additionner(5,6);
echo"L'addition de 5 et 6 est : $resultatAddition";

echo"\n";

$resultatSoustraction = $caluclatrice->soustraire(5,6);
echo"L'addition de 5 et 6 est : $resultatSoustraction";

echo"\n\n";
echo"Exo02";

class Student {
    public function affichage($moyenne) {
        if ($moyenne < 0 or $moyenne > 20) {
            echo "Error";
        } else if ($moyenne > 10 and $moyenne < 12 ) {
            echo "Passable";
        } else if ($moyenne >= 12 and $moyenne < 15) {
            echo "Bien";
        } else if ($moyenne >= 15 and $moyenne < 18) {
            echo "Tres bien";
        } else {
            echo "Excellent";
        } 
    }
    public function affichageSwitch( $moyenne) {
        switch ($moyenne) {
            case 18: {
                echo "Excellent.";
                break;
            }
            case 15: {
                echo "Tres Bien.";
                break;
            }
            default: {
                echo $this->affichage(moyenne: $moyenne);
                break;
            }
        }
    }

    public function estMajeur($age) {
        if ( $age < 0) {
            echo "Error";
        }
        else if ( $age < 18) {
            echo "L'etudiant est mineur";
        }
        else {
            echo "L'etudiant est majeure";
        }
    }
    public function estMajeurSwitch( $age) {
        switch ($age) {
            case 18 : {
                echo "L'etudiant est majeure";
                break;
            }
            case 10 : {
                echo  "L'etudiant est mineur";
                break;
            }
            default:{ 
                echo $this->estMajeur($age);
            }
        }
    }

    public function estFemme($choix){
        switch ($choix) {
            case 1: {
                echo "Le choix est :homme";
                break;
            }
            case 2: {
                echo "Le choix est :femme";
                break;
            }
            default: {
                echo "Error";
            }
        }
    }
}
$stagaire = new Student();
echo"\n";
$stagaire->affichage(15);
echo"\n";
$stagaire->affichageSwitch(15);
echo"\n";
$stagaire->estMajeur(5);
echo"\n";
$stagaire->estMajeurSwitch(5);
echo"\n";
$stagaire->estFemme(1);
echo"\n\n";
?>
