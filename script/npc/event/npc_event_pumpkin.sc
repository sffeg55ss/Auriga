//�J�{�`�������̐ݒ�
//(�{����force_1-1.gat �������A�A���[�i�N�G�X�g�Əd�����邽�߁A��MAP�ٖ���2-1���g�p)
//	�� ����2-1���d������̂ł��̃X�N���v�g�𗘗p�������ꍇ�͓K�؂ȏꏊ�Ɉړ����邱��

force_2-1.gat,100,100,0,0	monster	�U�b�N	1130,200,50000,25000
force_2-1.gat,100,100,0,0	monster	�u���b�f�B�i�C�g	1268,5,50000,25000
force_2-1.gat	mapflag	nosave	prontera.gat,156,191
force_2-1.gat	mapflag	nomemo	dummy
force_2-1.gat	mapflag	noteleport	dummy
force_2-1.gat	mapflag	pvp	dummy
//�C�x���g�z�[���̐ݒ�
pvp_2vs2.gat	mapflag	nosave	prontera.gat,156,191
pvp_2vs2.gat	mapflag	nomemo	dummy
pvp_2vs2.gat	mapflag	noteleport	dummy
pvp_2vs2.gat	mapflag	pvp	dummy


prt_monk.gat,225,180,0	script	����	89,{
	mes "[����]";
	mes "�앨����l�����Ă����";
	mes "�_�̒������������ɂ͂����Ȃ��B";
	next;
	mes "[����]";
	mes "���̍앨���͔|�����烂���N��";
	mes "�������܂��������B";
	next;
	mes "[����]";
	mes "�{���ɔ_�Ƃ͂����c�c";
	mes "�M�l�����i���ɂ����؂��܂�";
	mes "�N���̓w�͂̌����Ȃ̂��B";
	next;
	mes "[����]";
	mes "���̒n��ɖ������^���ɂȂ����_��";
	mes "�앨���͔|����҂��ׂĂ�";
	mes "�������ӂ̋C���������̂��B";
	next;
	mes "[����]";
	mes "�_�Ƃ͍��̊�ՁB";
	mes "���Ɨǂ����t�ł��낤���c�c";
	close;
}

gef_fild00.gat,77,212,4	script	���ӋC�Ȏq	716,{
	mes "[���ӋC�Ȏq]";
	mes "�����A���̃s�G���߁E�E�E";
	mes "�l�̃L�����f�B�[��D������ɁA";
	mes "�����Ƃ����������ė������Ȃ�āI";
	mes "���ꂾ�����l�̓L���C�Ȃ񂾂�B";
	mes "��΂����d�Ԃ����Ă��I�I";
	close;
}

pvp_2vs2.gat,40,30,4	script	���a��	67,{
	mes "[���a��]";
	mes "���������C�Ȃ̂��H�I";
	mes "���A����ȁ`�`�`�I�I";
	mes "���܂��Ȃ񂩂ǂ����ɔ��ł����I";
	close2;
	warp "prt_monk.gat",95,212;
	end;
}

// �� PUMP_EVE -> 0�`2

xmas_in.gat,27,103,4	script	�������储�΂���#pump	701,{
	if(PUMP_EVE != 1) {
		mes "[�^�V���`�F]";
		mes "�����[�N���X�}�X�[";
		mes "�ق��ققف`";
		mes "�V�[�Y�����V�[�Y��������";
		mes "��҂��������񌩂���˂��`�B";
		mes "�A�^�C���ꏏ�ɎႭ�Ȃ����݂����ˁ`�B";
		mes "�ق��ققف`";
		next;
		mes "[�^�V���`�F]";
		mes "���̑��ɂ̓��e�B�G�_���W�����Ƃ���";
		mes "��������H��݂�����";
		mes "�Ƃ��낪���邯�ǁA";
		mes "�܂��A���̐l���畷������";
		mes "�Ȃ�ƂȂ�������Ǝv�����ǂˁ[";
		mes "���A���ꂪ�c";
		next;
		mes "[�^�V���`�F]";
		mes "���̑O�����������ƂȂ񂾂��ǂˁA";
		mes "���̃_���W�����̒��ŏZ��ł�";
		mes "�����X�^�[�̒��ɂ�";
		mes "�����ł�������̂�";
		mes "���Ă���z�������炵���́B";
		next;
		mes "[�^�V���`�F]";
		mes "���|�͓��������ǂˁA";
		mes "�������̒n���͖{���Ɋ�������";
		mes "���̐��i���ς���Ă��܂�����A";
		mes "�F���ς���Ă��܂����肷��";
		mes "�݂����Ȃ̂�B�A�^�C�������������";
		next;
		mes "[�^�V���`�F]";
		mes "�K�����Ă����ł��傤���ǁB";
		mes "�ق��ققف`";
		mes "���ꂶ��A���낻��A�^�C��";
		mes "�L���`���̏��������悤���B";
		mes "�����A���̃L���`����邩���āH";
		mes "�A�^�C�́u�`���R�L���`�v���˂��B";
		next;
		mes "[�^�V���`�F]";
		mes "���؃L���`��";
		mes "�`���R���[�g��ǂ�������";
		mes "���o�����A�^�C�񂿂̌���i!!";
		mes "�ق��ققف`";
		mes "����H�ׂ�ƖY����Ȃ��̂�";
		mes "�ف[�ق��ققق�!!!!";
		close;
	}
	//pumpkin event
	mes "[�^�V���`�F]";
	mes "����A���@�̃J�{�`������Ȃ����B";
	mes "���H�������ė~�����̂����H";
	mes "���Ⴀ�r��U����Ă����悤���ˁB";
	next;
	mes "[�^�V���`�F]";
	mes "�����H�ׂ����񂾂��H";
	mes "�������߂̓A�C�X��";
	mes "�L�����f�B�[����B";
	mes "�A�C�X�͕��ʂ��ۂ�";
	mes "�Ȃ����Ⴄ���ǂˁB";
	next;
	if(select("�A�C�X","�L�����f�B�[")==1) {
		mes "[�^�V���`�F]";
		mes "�悵�A����B";
		mes "�����A�L���`��������";
		next;
		mes "- �S���S�� �K���K�� -";
		next;
		mes "- �E�E�E Success !! -";
		next;
		mes "[�^�V���`�F]";
		mes "�����A�o�����I";
		getitem 536,1;
		set PUMP_EVE,0;
		next;
		mes "[�^�V���`�F]";
		mes "���ʂ̃A�C�X�Ƃ�";
		mes "�ق�̂�����Ƃ���";
		mes "�ꖡ�Ⴄ�񂾂�B";
		mes "�킩�邩�˂��H";
	}
	else {
		mes "[�^�V���`�F]";
		mes "�悵�A����B";
		mes "�L���`�����Ƃ��Ł`";
		next;
		mes "- �J�L���J�L�� �W���[�W���[ -";
		next;
		mes "- �E�E�E Success !! -";
		next;
		mes "[�^�V���`�F]";
		mes "�����A�o�����I";
		mes "�u�p���v�L���L�����f�B�[�v����B";
		mes "������̃L�����f�B�[�Ƃ�";
		mes "�ꖡ���񖡂��Ⴄ�񂾂�B";
		mes "�킩�邩�˂��H";
		next;
		set PUMP_EVE,2;
		mes "- �p���v�L���L�����f�B�[ -";
		mes "- ����ɓ��ꂽ -";
	}
	close;
OnInit:
	disablenpc "�������储�΂���#normal";
	end;
}

//--------------------------------------------------
prt_monk.gat,218,175,4	script	�C���m	49,{
	if(PUMP_EVE == 0) {
		mes "[�C���m]";
		mes "���N�͉��N���Ԃ��";
		mes "���@�̃J�{�`�������܂����B";
		mes "�������͐H�Ɣ��~�̂��߂�";
		mes "���@�̃J�{�`��1��";
		mes "�ʏ�̃J�{�`��10��";
		mes "�������Ă��܂��B";
		next;
		mes "[�C���m]";
		mes "���Ȃ����������ł����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�C���m]";
			mes "�����ł����B�c�O�ł��B";
			mes "�Ƃ��Ă�����������ł���B";
			close;
		}
		if(countitem(535)<10) {
			mes "[�C���m]";
			mes "�J�{�`����������";
			mes "�Ȃ�����Ȃ��ł����B";
			mes "10�ƌ����ł��B";
			close;
		}
		mes "- ���@�̃J�{�`������ɓ��ꂽ -";
		delitem 535,10;
		set PUMP_EVE,1;
		next;
		mes "[�C���m]";
		mes "���肪�Ƃ��B";
		mes "���@�̃J�{�`����";
		mes "�ς邾���łƂ��Ă����������ł���";
		mes "�ς�����H�ו�������悤�ł��B";
		next;
		mes "[�C���m]";
		mes "�ڂ����m�肽�����";
		mes "���e�B�G�̃^�V���`�F���΂����";
		mes "�����Ă݂Ă��������B";
		close;
	}
	mes "[�C���m]";
	mes "���@�̃J�{�`����";
	mes "��x�Ɉ�̌�����";
	mes "�����Ă��������Ă܂��B";
	mes "��x�H�ׂ�";
	mes "���̂��������������Ă���";
	mes "�܂����Ă��������B";
	next;
	mes "[�C���m]";
	mes "�J�{�`�������ɂ���";
	mes "�ڂ����m�肽�����";
	mes "���e�B�G�̃^�V���`�F���΂����";
	mes "�����Ă݂Ă��������ˁB";
	close;
}

prt_monk.gat,227,162,4	script	�C�s�m	753,{
	if(PUMP_EVE != 1) {
		mes "[�C�s�m]";
		mes "�����A���񂽂���";
		mes "���@�̂��ڂ���͖���������H";
		mes "���B�͂��̔��ň�����h�{���_��";
		mes "�J�{�`����H����";
		mes "�����܂ŋ����Ȃ����񂾁I";
		next;
		mes "[�C�s�m]";
		mes "���ɖ��@�̃J�{�`���͊i�ʂ��B";
		mes "�܂����������x�H�ׂĂ݂�Ƃ������B";
		close;
	}
	mes "[�C�s�m]";
	mes "�������񂽂����@�̃J�{�`����";
	mes "����������B";
	mes "�ӂށA���͗����̏�肢���΂����";
	mes "�m���Ă�񂾂��A���̃J�{�`����";
	mes "�����čs���Η������Ă���邩��";
	mes "�����B�s���Ă݂邩���H";
	next;
	if(select("����I","����A���\�ł�")==2) {
		mes "[�C�s�m]";
		mes "�����[������B";
		close;
	}
	mes "[�C�s�m]";
	mes "�悵�����I";
	mes "�߂��܂ŘA��čs���Ă�낤�B";
	close2;
	warp "xmas_fild01.gat",150,150;
	end;
}

gef_fild00.gat,73,209,4	script	���Ȃ�s�G��	715,{
	if(PUMP_EVE != 2) {
		if(countitem(536)<1 && countitem(530)<1) {
			mes "[���Ȃ�s�G��]";
			mes "�������E�E�E�B";
			mes "�l�̑�D���Ȃ��َq��";
			mes "�����Ȃ����������B";
			mes "���َq���H�ׂ����Ȃ��E�E�E";
			next;
			mes "[���Ȃ�s�G��]";
			mes "�˂��A�����悩������";
			mes "�������َq�������Ă��Ă���Ȃ��H";
			next;
			switch (select("������","���₾��","���߂�ˁA�Z�����āc")) {
			case 1:
				mes "[���Ȃ�s�G��]";
				mes "�{����!?";
				mes "���肪�Ɓ`";
				mes "����A�҂��Ă��I";
				close2;
				warp "xmas_dun01.gat",205,17;
				end;
			case 2:
				mes "[���Ȃ�s�G��]";
				mes "�ށI";
				mes "�P�`�I";
				close2;
				warp "prt_monk.gat",182,236;
				end;
			case 3:
				mes "[���Ȃ�s�G��]";
				mes "�������c�c";
				mes "�܂��A���傤���Ȃ��ˁc�c";
				close;
			}
		}
		mes "[���Ȃ�s�G��]";
		mes "�����I";
		mes "�N�̎����Ă��邨�َq��";
		mes "�l�ɂ���Ȃ����ȁH";
		next;
		if(select("�͂�","������")==2) {
			mes "[���Ȃ�s�G��]";
			mes "�������I";
			close;
		}
		//���������Ă��痼���Ƃ������H
		if(countitem(536))
			delitem 536,1;
		if(countitem(530))
			delitem 530,1;
		mes "[���Ȃ�s�G��]";
		mes "�y���y���A�y���y��";
		mes "���肪�Ƃ��B";
		next;
		if(select("�ǂ��������܂���","����́H")==1) {
			mes "[���Ȃ�s�G��]";
			mes "�y���y���A�y���y��";
			close;
		}
		mes "[���Ȃ�s�G��]";
		mes "�L�����f�B�[���炢��";
		mes "�P�`�P�`����Ȃ�I";
		mes "�����ƕς�����A����";
		mes "�����Ă��Ȃ��I";
		mes "�x���x���x�`";
		close2;
		warp "prt_monk.gat",95,212;
		end;
	}
	mes "[���Ȃ�s�G��]";
	mes "���[�I";
	mes "�p���v�L���L�����f�B�[�I�I";
	mes "���ՁI";
	mes "����H�ׂ����ā[�I�I";
	next;
	if(select("���傤���Ȃ��Ȃ�","���₾��")==2) {
		mes "[���Ȃ�s�G��]";
		mes "�E�E�E";
		mes "�ӂ�A���႟�����";
		mes "���炤����I";
		mes "�x���x���x���[���I";
		next;
		mes "- �p���v�L���L�����f�B�[ -";
		mes "- ���Ƃ�ꂽ -";
		set PUMP_EVE,0;
		next;
		mes "[���Ȃ�s�G��]";
		mes "�������ɍs�����Ⴆ�I";
		close2;
		warp "prt_monk.gat",95,212;
		end;
	}
	mes "[���Ȃ�s�G��]";
	mes "������[�I�I";
	mes "���Ⴀ�A�����";
	mes "���@���v���[���g���B";
	mes "Trick or Treat�H";
	next;
	if(select("Trick","Treat")==1) {	//Trick�I��
		set PUMP_EVE,0;
		switch(rand(11)) {
		case 0:		//�Q�t�F��D(B4)
			mes "[���Ȃ�s�G��]";
			mes "�����Ă��[���I";
			warp "gef_dun03.gat",138,119;
			break;
		case 1:		//GH�n�����H
			mes "[���Ȃ�s�G��]";
			mes "�������l�܂��Ă�炵������";
			mes "�|�����ė��ā`";
			warp "gl_sew04.gat",293,6;
			break;
		case 2:		//GH�ŉ��w�n�����A
			mes "[���Ȃ�s�G��]";
			mes "������T������h�����܂��I";
			warp "gl_dun02.gat",138,72;
			break;
		case 3:		//�^�[�g���A�C�����h�v�z�{
			mes "[���Ȃ�s�G��]";
			mes "�N������ŉ��l�ǂ��������I�I�I";
			warp "tur_dun04.gat",100,111;
			break;
		case 4:		//�C�Y���[�h�C��_�a
			mes "[���Ȃ�s�G��]";
			mes "�{���J�X�I���ϗ����I�I";
			warp "iz_dun04.gat",130,227;
			break;
		case 5:		//���v���n��
			mes "[���Ȃ�s�G��]";
			mes "��������N�������̓X�����I";
			warp "c_tower4.gat",119,179;
			break;
		case 6:		//���v�D2F
			mes "[���Ȃ�s�G��]";
			mes "�D�����������I�I�I";
			warp "tresure02.gat",100,164;
			break;
		case 7:		//�J�{�`������
			mes "[���Ȃ�s�G��]";
			mes "����l���܂��ē��`";
			warp "force_2-1.gat",100,100;
			break;
		case 8:		//�m�[�O���[�h2F
			mes "[���Ȃ�s�G��]";
			mes "�N�̐l����ɊR���Ղ��I";
			warp "mag_dun02.gat",212,169;
			break;
		case 9:		//PvP�C�x���g�z�[��
			mes "[���Ȃ�s�G��]";
			mes "�����̉^���F�҂��l�����炸�B";
			warp "pvp_2vs2.gat",19,39;
			break;
		case 10:	//�W���m�[
			mes "[���Ȃ�s�G��]";
			mes "�悵�I��������|�[�Y�����߂�񂾁I";
			warp "yuno.gat",210,310;
			break;
		}
		end;
	}
	else {	//�m����500�񎎍s�����m��(�^�T�C�g���Q�l)
		set PUMP_EVE,0;
		set '@rand,rand(100);
		if('@rand >= 0 && '@rand < 10) 	 getitem 536,1;		//�A�C�X�N���[��(12.4%)
		if('@rand >= 10 && '@rand < 20)  getitem 2262,1;		//�s�G���̕@(10.6%)
		if('@rand >= 20 && '@rand < 29)  getitem 715,2;		//�C�G���W�F���X�g�[��(9.6%)
		if('@rand >= 29 && '@rand < 38)  getitem 7126,1;		//�ł������[���s�[(9.4%)
		if('@rand >= 38 && '@rand < 47)  getitem 716,2;		//���b�h�W�F���X�g�[��(8.6%)
		if('@rand >= 47 && '@rand < 55)  getitem 717,2;		//�u���[�W�F���X�g�[��(8%)
		if('@rand >= 55 && '@rand < 63)  getitem 2209,1;		//���{��(8%)
		if('@rand >= 63 && '@rand < 69)  getitem 911,1;		//�Z���[(5.8%)
		if('@rand >= 69 && '@rand < 75)  getitem 713,1;		//�󂫕r(5.4%)
		if('@rand >= 75 && '@rand < 81)  getitem 1093,1;		//��̃|�[�V�����r(4.8%)
		if('@rand >= 81 && '@rand < 85)  getitem 1092,1;		//��̎�����(3.8%)
		if('@rand >= 85 && '@rand < 89)  getitem 909,1;		//�[���s�[(3.6%)
		if('@rand >= 89 && '@rand < 92)  getitem 741,1;		//�|�����l�`(3.4%)
		if('@rand >= 92 && '@rand < 94)  getitem 546,1;		//�C�G���[�X�����|�[�V����(2.2%)
		if('@rand >= 94 && '@rand < 96)  getitem 547,1;		//�z���C�g�X�����|�[�V����(1.4%)
		if('@rand >= 96 && '@rand < 98)  getitem 545,1;		//���b�h�X�����|�[�V����(1.2%)
		if('@rand >= 98 && '@rand < 100) getitem 644,1;		//�v���[���g�{�b�N�X(1.6%)
		mes "[���Ȃ�s�G��]";
		mes "�N�ɂ���������悤�I";
		next;
		mes "[���Ȃ�s�G��]";
		mes "�ǂ��H";
		mes "�{�N�̖��@�H";
		mes "�C�ɓ����Ă��ꂽ�H";
		mes "�x���x���`���I";
		close;
	}
}