//= Auriga Script ==============================================================
// Ragnarok Online Niflheim Monster Spawn Script�@�@Ep 15.2
//==============================================================================

//============================================================
// ���҂̊X�j�u���w�C�� - niflheim.gat
//------------------------------------------------------------
niflheim.gat,0,0,0,0	monster	�L���[�u	1508,75,5000,0,0
niflheim.gat,0,0,0,0	monster	���[�h	1509,75,5000,0,0

niflheim.gat,0,0,0	script	#NifMVP	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer7980000:
	switch(rand(7)) {
	case 0:
		monster "niflheim.gat",327,193,"���[�h�I�u�f�X",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",330,193,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",324,193,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",327,196,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",327,190,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",324,190,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",330,190,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",324,196,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",330,196,"��������",1505,1,"#NifMVP::OnKilled2";
		break;
	case 1:
		monster "niflheim.gat",337,252,"���[�h�I�u�f�X",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",337,255,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",337,249,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",334,252,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",340,252,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",334,249,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",340,255,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",340,249,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",334,255,"��������",1505,1,"#NifMVP::OnKilled2";
		break;
	case 2:
		monster "niflheim.gat",190,185,"���[�h�I�u�f�X",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",190,188,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",190,182,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",193,185,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",187,185,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",187,182,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",193,182,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",193,188,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",187,188,"��������",1505,1,"#NifMVP::OnKilled2";
		break;
	case 3:
		monster "niflheim.gat",131,138,"���[�h�I�u�f�X",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",131,141,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",131,135,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",128,138,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",134,138,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",134,141,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",128,141,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",134,135,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",128,135,"��������",1505,1,"#NifMVP::OnKilled2";
		break;
	case 4:
		monster "niflheim.gat",311,64,"���[�h�I�u�f�X",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",311,67,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",311,61,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",308,64,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",314,64,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",314,61,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",314,67,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",308,67,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",308,61,"��������",1505,1,"#NifMVP::OnKilled2";
		break;
	case 5:
		monster "niflheim.gat",238,131,"���[�h�I�u�f�X",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",238,134,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",238,128,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",235,131,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",241,131,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",235,128,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",235,134,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",241,128,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",241,134,"��������",1505,1,"#NifMVP::OnKilled2";
		break;
	case 6:
		monster "niflheim.gat",86,219,"���[�h�I�u�f�X",1373,1,"#NifMVP::OnKilled1";
		monster "niflheim.gat",86,222,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",86,216,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",89,219,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",83,219,"�u���b�f�B�}�[�_�[",1507,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",89,222,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",89,216,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",83,222,"��������",1505,1,"#NifMVP::OnKilled2";
		monster "niflheim.gat",83,216,"��������",1505,1,"#NifMVP::OnKilled2";
		break;
	}
	monster "niflheim.gat",154,95,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",115,65,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",330,195,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",151,83,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",285,245,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",235,135,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",265,48,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",186,139,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",166,267,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",82,202,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",219,44,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",287,44,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",275,165,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",138,204,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",299,39,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",31,154,"�f�B�X�K�C�Y",1506,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",154,96,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",116,65,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",151,84,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",286,245,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",330,196,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",236,135,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",165,49,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",167,267,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",82,203,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",220,44,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",287,45,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",287,44,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",276,166,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",139,205,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",300,39,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	monster "niflheim.gat",31,155,"�f�����n��",1504,1,"#NifMVP::OnKilled2";
	stopnpctimer;
	end;
OnKilled1:
	killmonster "niflheim.gat","#NifMVP::OnKilled2";
	initnpctimer;
	end;
OnKilled2:
	end;	//�_�~�[�C�x���g
}