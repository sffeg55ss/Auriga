//====================================================================
//Ragnarok Online StarGladiator Jobchange Script
//�@�� CHANGE_SG -> 0�`12
//====================================================================

//==========================================
// �����\��
//------------------------------------------

payon.gat,215,102,3	script	���q����	828,3,3,{
	if(Job == Job_Star) {
		mes "[���q����]";
		mes "����c�c�N�́c�c";
		mes "���z�ƌ��Ɛ��̐�m����Ȃ���!?";
		mes "�͂́A�v���Ԃ肾�ˁI";
		mes "�l�̂��Ɖ����Ă�H";
		mes "���܂�����Ă�悤���ˁB";
		mes "�A�n�n�b�I";
		close;
	}
	if(Job == Job_Novice) {
		mes "[���q����]";
		mes "�����p�����H";
		mes "�N���e�R���L�b�h�ɂȂ肽���̂��ȁH";
		mes "�Ȃ�A���`�����m��Ȃ��u�P���v";
		mes "�Ƃ�����ɉ�ɍs���Ă����B";
		mes "�߂��ɂ���͂������炷���������B";
		next;
		mes "[���q����]";
		mes "���[���Ɛ�̎������ǁc�c";
		mes "�e�R���h�[�ɖO�������ɁA";
		mes "�܂��l�̏��ɗ��Ă����B";
		mes "�t�t�B";
		close;
	}
	if(Job != Job_Taekwon) {
		mes "[���q����]";
		mes "�p�������ɂ��܂�����Ȃ��ł�B";
		if(Sex) {
			mes "���Z����͒j��";
			mes "�킫����˕t���ꂽ���́H";
			mes "�܂����ςȎ��!?";
		}
		else {
			mes "����A���o���񂶂Ⴕ�傤���Ȃ����B";
			mes "����Ȃɉ��ɋ���������Ȃ�";
			mes "���r�����ς��L���ĕ�������";
			mes "�����悤���H�@�t�t�B";
		}
		next;
		mes "[���q����]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		mes "�͂��A�͂��B";
		mes "��k�͂����܂łɂ��邩��B";
		mes "����Ȃɓ{��Ȃ��ł�B";
		next;
		mes "[���q����]";
		mes "���͂��������Ă�";
		mes "�̂͑��z�ƌ��Ɛ��̐�m�������񂾂��B";
		next;
		mes "[���q����]";
		mes "�M���邱�Ƃ��ł��Ȃ����āH";
		mes "�Ȃ牴�Ɏq���B��C���Č��Ȃ�B";
		mes "�����������ɂ���";
		mes "���肩�����Ă��񂾂���I";
		close;
	}
	switch(CHANGE_SG) {
	case 0:
		mes "[���q����]";
		mes "�₟�A�e�R��" +(Sex)? "���N�I": "�����I";
		mes "���Ƃ�����Ƃ��b���Ȃ��H";
		mes "�ȂɂȂɁA�����I�����āB";
		next;
		if(select("�����ł���","���ł��I")==2) {
			mes "[���q����]";
			mes "�����ς�ƌ����˂��B";
			mes "������ƌ��t�g����������B";
			mes "���ɒf�鎞��";
			mes "��������������C�����ĂˁB";
			close;
		}
		mes "[���q����]";
		mes "���O�́H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes strcharinfo(0)+"�B";
		next;
		mes "[���q����]";
		mes "�����z���Ȃ��B";
		mes strcharinfo(0)+"�ł��B";
		mes "���ꂮ�炢����Ȃ�����B";
		next;
		mes "[���q����]";
		mes "���������A�N���ď������ɂȂ肽���H";
		mes "�����悩������";
		mes "^4A4AFF���z�ƌ��Ɛ��̐�m^000000";
		mes "�ɂȂ�Ȃ����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����͉��ł����H";
		mes "�����ł����c�c";
		mes "�����m���Ă���̂�";
		mes "�u�\�E�������J�[�v�Ɓu�����v�A";
		mes "���̓�����ł��B";
		next;
		mes "[���q����]";
		mes "�ւ��c�c�悭�m���Ă񂶂��B";
		mes "�N�����������u�����v�̎���";
		mes "���z�ƌ��Ɛ��̐�m�̂��Ƃ��B";
		mes "�Ƃ��Ă����͓I�ȐE�Ƃ���B";
		mes "�N�͌����ɂȂ肽���Ȃ��́H";
		next;
		if(select("���̖ڕW�ł��I","�ׂɁc�c")==2) {
			mes "[���q����]";
			mes "���������B";
			mes "�N�̓\�E�������J�[��茝���̂ق���";
			mes "�������Ă�Ǝv���񂾂��ǂȂ��c�c";
			mes "�܁A�܂����I";
			mes "�i���Ƀe�R���L�b�h�ł�������!?";
			next;
			mes "[���q����]";
			mes "�E�E�E�E�c�c";
			mes "�܂��c�c";
			mes "�S�ς��ł�������܂������ł�B";
			mes "���ł������ɂ��Ă����邩�炳�B";
			close;
		}
		mes "[���q����]";
		mes "�ڕW���c�c";
		mes "����ς肻�����I";
		mes "���̖ڂ͊m���������I";
		mes "�N�̏����͌������B";
		next;
		if(JobLevel < 40) {
			mes "[���q����]";
			mes "�ł��c�c";
			mes "�܂�������ƃ��x���s�����ȁc�c";
			mes "�e�R���L�b�h�ł̏C����";
			mes "���������l�܂Ȃ��ƁB";
				mes "���߂ăW���u���x��40�͂Ȃ��ƂˁB";
			next;
			mes "[���q����]";
			mes "���������͂�t���Ă���܂������ŁB";
			mes "�悵�A���Ɩ񑩂��悤�B";
			mes "�K�������ɂȂ���ĂˁI";
			close;
		}
		mes "[���q����]";
		mes "�ǂ��ˁI�@�C�����l��ł��邵";
		mes "�g���S����䂻�����B";
		mes "�����ǁA����ȌN�ɂ�";
		mes "�����Ȃ���������c�c";
		mes "�����A�搶���I";
		next;
		mes "[���q����]";
		mes "�N�𑾗z�ƌ��Ɛ��̐�m�ւ�";
		mes "�����Ă����搶���B";
		mes "�悩�����炻�̐l���Љ�Ă������B";
		mes "�����������x������B";
		next;
		mes "[���q����]";
		mes "^4A4AFF�����ɓ]�E^000000���邩���H";
		next;
		if(select("�]�E���܂�","�l���鎞�Ԃ���������")==2) {
			mes "[���q����]";
			mes "�������B";
			mes "�܂��A�����ɂȂ肽���Ȃ�����";
			mes "���ł������ł�B";
			close;
		}
		mes "[���q����]";
		mes "�悵�I�@�ǂ��������B";
		mes "���ꂶ�Ⴀ";
		mes "�N�ɐ搶���Љ�Ă������B";
		mes "���Ă킩��悤�ɁA�������ɂ�";
		mes "��y�琬�̂��߂̃M���h�͂Ȃ��񂾁B";
		next;
		mes "[���q����]";
		mes "�������A���̂�������";
		mes "�������Ă��������R���^������B";
		mes "�������ŘA�������h���Ȃ邯�ǂˁc�c";
		next;
		mes "[���q����]";
		mes "�c�c�Ƃɂ����A�����������Ƃ�����B";
		mes "���͐搶�̋��ꏊ��m���Ă��邩��A";
		mes "�����Ă������B";
		next;
		mes "[���q����]";
		mes "^4A4AFF���K��^000000�Ƃ����搶���B";
		mes "���̐l�͌����̒��ň��";
		mes "��y�̂��߂ɂ���΂��Ă���l����B";
		mes "���̐l�ɏЉ��������Ă������B";
		next;
		mes "[���q����]";
		mes "�u���K���v�搶�͍��R���h�ɂ����B";
		mes "�R���h�͈�ԋ�ɋ߂��񂾁B";
		mes "�K�����̐l��K�˂ĂˁB";
		set CHANGE_SG,1;
		close;
	case 1:
		mes "[���q����]";
		mes "�R���h�ɂ���u���K���v�搶��";
		mes "��ɍs���āB";
		mes "�����Љ��͑����Ă����B";
		close;
	default:
		mes "[���q����]";
		mes "���z�ƌ��Ɛ��̐�m�ɂȂ邽�߂̎�����";
		mes "�͂��ǂ��Ă��邩�ȁH";
		mes "�N�͌����ɂȂ�񂾂�B";
		if(CHANGE_SG != 6)
			close;
		next;
		mes "[���q����]";
		mes "����A�ǂ�����F���悭�Ȃ��ˁB";
		mes "���������Ă���́H";
		mes "�Ȃ�Ȃ牴����`���Ă����悤���H";
		next;
		if(select("�����A��l�ł���Ă݂����ł�","���́A�s�����搶�̎���")==1) {
			mes "[���q����]";
			mes "�������ˁB";
			mes "��l�ŔY��ł݂�̂����������B";
			mes "�����ւ̓��͍��܂łƂ͈Ⴄ�񂾁B";
			mes "�����Ŕ��f���Ȃ���΂Ȃ�Ȃ�����";
			mes "�K�����邩��ˁB";
			next;
			mes "[���q����]";
			mes "������A�ƂĂ��T�d�Ȑl������";
			mes "�������ƌ�����񂾁B";
			mes "�l���́u��邼�I�@���₾�I�v";
			mes "���ĊȒP�ɍs�����藈����";
			mes "���邱�Ƃ��ł��Ȃ����񂾂�B";
			close;
		}
		mes "[���q����]";
		mes "�s�����l�����Č���������";
		mes "�����Ȃ��Ă��킩���B";
		mes "���ɉ����������čs���K�v��";
		mes "�Ȃ��񂾁B";
		next;
		mes "[���q����]";
		mes "����l���Ă����ˁB";
		mes "�K�����������������čs����";
		mes "�ؖ�����K�v�Ȃ�ĂȂ��񂾂�B";
		next;
		mes "[���q����]";
		mes "������Ȃ����ȁH";
		mes "�����̐M�O�͎����ɂ���";
		mes "�ؖ����邱�Ƃ��ł��Ȃ��Ƃ���";
		mes "�ƂĂ��ȒP�Ș_�����B";
		next;
		mes "[���q����]";
		mes "�u��肽���I�v";
		mes "�u������߂���񂩁I�v";
		mes "�u����͂��Ȃ��I�v";
		mes "�N�����Č������Ƃł���H";
		next;
		mes "[���q����]";
		mes "�F�������̐M�O�̂��߂�";
		mes "���g�𕱂��������Ă���B";
		mes "�l�X�͂���ȓ���̒��ŏZ��ł�B";
		next;
		mes "[���q����]";
		mes "����΂��Ă������҂��ŁA";
		mes "�H���Ȃ��Ȃ���������čs���l�X�B";
		mes "�F�������c�c";
		mes "���A���̏�Ő����Ă��邱�Ƃ��A";
		mes "���݂��Ă��邱�Ƃ��ؖ����邽�߂�";
		mes "�w�͂��Ă���񂾁B";
		next;
		mes "[���q����]";
		mes "����œ������o�Ȃ��H";
		mes "�N�̋��̒��ɂ��铚���͉������H";
		next;
		if(select("������߂����Ȃ��I","���̎���������Ȃ�")==2) {
			mes "[���q����]";
			mes "�c�c�c�c�c�c�c�c�c�c�������B";
			mes "�����܂ŐF�X�Ƙb�������ǁA";
			mes "���C�͂���́H";
			next;
			mes "[���q����]";
			mes "���΂炭�����₵�Ă����ŁB";
			mes "�������̂��߂Ɂc�c";
			mes "�N�̂��߂ɔM�ق������̂��c�c";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "���͂�����߂����Ȃ��I";
		mes "�������ɂ́A�����g�̈ӎu��";
		mes "��������̑��ŗ����Ă���";
		mes "���̎������邾�����I";
		next;
		mes "[���q����]";
		mes "�����I�@�ǂ��p�����I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���͎����̈ӎu�ł��̓�������Ă���I";
		mes "������ؖ�����͎̂��������B";
		mes "���͌����ɂȂ�!!!!";
		next;
		mes "[���q����]";
		mes "�����I�@������߂�ȁI";
		mes "�Η����Đ킦�I";
		mes "����̓�̖ڂ����߂Ȃ���";
		mes "����X����҂��ڋ��҂��I";
		next;
		mes "[���q����]";
		mes "�N�́A���̐g�ƐS�ŁI";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̑̂ƐS�ŁI";
		mes "�������ؖ�����I";
		next;
		mes "[���q����]";
		mes "�悭�������I";
		mes "�C�����\�����Ċ�������B";
		mes "���̂܂܃��K���搶�ɉ��";
		mes "���̕����ɑ����Ă�����B";
		mes "���x����͌����łˁI";
		set CHANGE_SG,7;
		close;
	case 7:
		mes "[���q����]";
		mes "���K���搶�Ɍ�����";
		mes "���̕����ɑ����Ă�����B";
		mes "���x����͌����łˁI";
		close;
	}
OnTouch:
	if(Job == Job_Star) {
		mes "[���q����]";
		mes "����c�c�N�́c�c";
		mes "���z�ƌ��Ɛ��̐�m����Ȃ���!?";
		mes "�͂́A�v���Ԃ肾�ˁI";
		mes "�l�̂��Ɖ����Ă�H";
		mes "���܂�����Ă�悤���ˁB";
		mes "�A�n�n�b�I";
		close;
	}
	if(Job != Job_Taekwon) {
		mes "[���q����]";
		mes "������ƁI�@�����ǂ��Ă�I";
		mes "���z�̌���������Ȃ�����I";
		close;
	}
	if(CHANGE_SG == 0) {
		mes "[���q����]";
		mes "�˂��˂��A�����̌N�B";
		mes "������Ɖ��̘b�𕷂��Č��Ȃ��H";
		mes "�����ςނ��炳�B";
		close;
	}
}

//==========================================
// �]�E
//------------------------------------------

comodo.gat,172,230,3	script	���Q������	730,{
	if(Job == Job_Star) {
		mes "[���q����]";
		mes "�v���Ԃ肾�ȁB";
		mes "�ŋ߂͂ǂ��ɁH";
		mes "�n�n�b�B";
		mes "�������";
		mes "���z�ƌ��Ɛ��̏j��������鏊���ȁB";
		next;
		mes "[���q����]";
		mes "���̒�����Y��Ȃ��悤�ɁB";
		mes "�������͈��̑I���Ől�������܂�B";
		mes "�N�ɂ͌�����Ȃ��I�������Ăق����B";
		next;
		mes "[���q����]";
		mes "�����A";
		mes "���z�ƌ��Ɛ������肪���������Ȃ�A";
		mes "���ł������Ȃ����B";
		mes "�����ɑ����Ă����悤�B";
		mes "���A���ɍs�����H";
		next;
		switch(select("�����A�����ł�","���z�̕����ɁI","���̕����ɁI","���̕����ɁI")) {
		case 1:
			mes "[���q����]";
			mes "�������B";
			mes "���͂��ł������ɂ��邩��";
			mes "���ł����Ȃ����B";
			close;
		case 2:
			mes "[���q����]";
			mes "���z�������L������";
			mes "�M����M���������Ă���Ƃ����B";
			close2;
			warp "job_star.gat",34,12;
			end;
		case 3:
			mes "[���q����]";
			mes "������������ƍl���邱�Ƃ�����̂��H";
			mes "������̕��Â�������";
			mes "�����w��ł���Ƃ����B";
			close2;
			warp "job_star.gat",100,13;
			end;
		case 4:
			mes "[���q����]";
			mes "���ڂ낰�Ȑ��������";
			mes "���������悤�ɂ��Ă����B";
			mes "����Ƃ������ł������̂��H";
			mes "�n�n�b�A��k���B";
			close2;
			warp "job_star.gat",166,29;
			end;
		}
	}
	if(Job != Job_Taekwon) {
		mes "[���Q������]";
		mes "�N���R�s���y����ł�̂��H";
		mes "���������牺�������낹��";
		mes "���̒����J���ė������Ȃ�ȁB";
		next;
		mes "[���Q������]";
		mes "������Ɛ������肪��t��";
		mes "��̗]�C�̒��ł͂��̊y���݂�";
		mes "�{�������c�c";
		next;
		mes "[���Q������]";
		mes "�n�b�n�c�c";
		mes "���ɂ͂��ꂪ�����Ȃ��Ƃ���";
		mes "���Ƃ���肾�ȁB";
		next;
		mes "[���Q������]";
		mes "�����₩����";
		mes "�N�̏�����";
		mes "���z�ƌ��Ɛ��̏j����";
		mes "�^�����鎖���F�낤�B";
		close;
	}
	switch(CHANGE_SG) {
	case 0:
		mes "[���K��]";
		mes "�e�R���h�[���C�����Ă���̂��B";
		mes "��͂�N�̂悤�Ȑl�ɂ�";
		mes "�����ڂ������Ă��܂��ȁB";
		mes "����B";
		mes "���̖��́u���K���v�ƌ����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes strcharinfo(0)+ "�ł��B";
		next;
		mes "[���K��]";
		mes "�c�c�c�c�N�c�c�c�c";
		mes "^4A4AFF�����ɂȂ�C�͂Ȃ����H^000000";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c���c�c����c�c���́c�c�c�c";
		next;
		mes "[���K��]";
		mes "�����A����͎���������B";
		mes "�����Ȃ��������Ƃɂ��Ă���B";
		mes "�n�b�n�n�n�B";
		next;
		mes "[���K��]";
		mes "�������͑��z�Ɓc�c���Ɓc�c���Ɓc�c";
		mes "�c�c���q������c�c���q������c�c";
		mes "�c�c�u�c�u�c�c�c�c�c";
		close;
	case 1:
		mes "[���K��]";
		mes "�҂��Ă������B";
		mes strcharinfo(0)+ "�B";
		mes "���q��������N�̘b�͕����Ă���B";
		next;
		mes "[���K��]";
		mes "���q������ʂ�����";
		mes "���������������Ƃ��ł��邪�A";
		mes "���Ă̒ʂ�";
		mes "���͑��z�ƌ��Ɛ��̈����ɏo������g�B";
		mes "�l�𖞑��Ɍ��邱�Ƃ��ł��Ȃ��B";
		next;
		mes "[���K��]";
		mes "���q�����̐l������ڂ͊m�����B";
		mes "�����āA�N�͂��̃��q�������F�߂��ҁB";
		mes "���z�ƌ��Ɛ��̑�s�l�ƂȂ�A";
		mes "�N������̑��Ɠ�̌���";
		mes "�g���S�\���͂ł��Ă��邩�H";
		next;
		if(select("�͂��I�@�]�E�������󂯂܂��I","�����̊ԁA���Ԃ���������")==2) {
			mes "[���K��]";
			mes "����������̂�����̂��H";
			mes "��͒������������c�c";
			mes "�����΂炭���R�͑҂��Ă���邾�낤�B";
			mes "�N�͌����ɂȂ邱�Ƃ�Y���ȁB";
			close;
		}
		if(SkillPoint) {
			mes "[���K��]";
			mes "�X�L���|�C���g���]���Ă���ȁB";
			mes "�N�͂܂��S�̒��ɂ��߂炢������悤���B";
			next;
			mes "[���K��]";
			mes "�K�������X�L���|�C���g���g���Ȃ����B";
			mes "�������Ȃ���΁A";
			mes "�����ɂȂ邱�Ƃ͂ł��Ȃ��B";
			close;
		}
		mes "[���K��]";
		mes "�N�͎����������ɂ��āA";
		mes "���̖{���𗝉����Ă��邩�H";
		next;
		mes "[���K��]";
		mes "�ڂ���Ď������]�ނ��Ƃ�";
		mes "�����Ă݂�B";
		mes "���r���J���ċ������Ă݂�B";
		next;
		mes "[���K��]";
		mes "�N�̒��̎��R���������邩�H";
		mes "�N�̋��͎��R���������邩�H";
		mes "�N�ƈꏏ�Ɍċz���鎩�R���������邩�H";
		next;
		mes "[���K��]";
		mes "�������͑��z�̌�������A";
		mes "��������œ������A";
		mes "��������̗l�ȑN����U��T���B";
		next;
		mes "[���K��]";
		mes "��������";
		mes "�t�炤���Ƃ��ł��Ȃ����R�̐ۗ���";
		mes "����n��Ȃ���΂Ȃ�Ȃ����݂��B";
		mes "�ł́A���������ۑ��^���悤�B";
		next;
		mes "[���K��]";
		mes "���E�e�n�ɎU��΂��Ă���";
		mes "���R�̗͂��W�߂ė����B";
		mes "���̐؂�[�A�����Ȃ��n�A";
		mes "����鐅�A�ܔM�̉��B";
		next;
		mes "[���K��]";
		mes "������";
		mes "^3434FF���t�E�B���h";
		mes "�O���C�g�l�C�`��";
		mes "�~�X�e�B�b�N�t���[�Y��";
		mes "�t���C���n�[�g^000000";
		mes "�Ƃ������ő��݂��Ă���B";
		next;
		mes "[���K��]";
		mes "�N�͌����ƂȂ�O��";
		mes "�ǂ�Ȏ��R�ł��낤�Ƃ�";
		mes "�߂炦�鎖���ł���Ƃ���";
		mes "���̏؋��������ė����B";
		mes "���ꂪ�����ɂȂ邽�߂̍ŏ��̎������B";
		set CHANGE_SG,2;
		close;
	case 2:
		if(countitem(996) < 1 || countitem(997) < 1 || countitem(995) < 1 || countitem(994) < 1) {
			mes "[���K��]";
			mes "�ǂ������B";
			mes "�N���o��A�����A";
			mes "�o�����Ă������R�������ė���񂾁B";
			mes "���R���������̗͂�";
			mes "�Ïk����Ȃ�������̐��E��";
			mes "�ǂ����ɎU��΂��Ă���񂾁B";
			next;
			mes "[���K��]";
			mes "�N�𕏂ł䂭��C���v���B";
			mes "�N������ł��邱�̑�n���v���B";
			next;
			mes "[���K��]";
			mes "������炵����ӂ̗�����v���B";
			mes "�M�����̂悤�Ȓg�������v���B";
			next;
			mes "[���K��]";
			mes "����͊������Ȃ���";
			mes "�������邱�ƁB";
			mes "����͖ڂɌ����Ȃ��������邱�ƁB";
			next;
			mes "[���K��]";
			mes "���܂�ɂ����R�̂悤�Ɏ�������";
			mes "�����Ă��邪�A�����邱�Ƃ��ł��Ȃ��B";
			mes "���܂�ɂ�����Ɏ�������";
			mes "���ł���̂ɁA���邱�Ƃ��ł��Ȃ��B";
			next;
			mes "[���K��]";
			mes "���ꂪ���R�Ƃ������݂��B";
			mes "���z�ƌ��Ɛ��̐�m��";
			mes "���Ȃ킿���R�̐�m���B";
			mes "�c�c�c�c�c�c";
			mes "�N�̍s���Ɋ��҂��悤�B";
			close;
		}
		mes "[���K��]";
		mes "�悭�߂��Ă����B";
		mes "�������������A";
		mes "�N�͂���������";
		mes "���������鎖���ł������H";
		next;
		mes "[���K��]";
		mes "���Ɍċz���Ȃ�����������A";
		mes "���߂̏u�ԂɉB�����n��������镗�B";
		mes "�F�̉��ɂ��邪";
		mes "���E�𕢂����Ƃ��ł��閬���̑�n�B";
		next;
		mes "[���K��]";
		mes "�����ɉ��֗���邪";
		mes "������ω������A�₦�鑧�Â�����";
		mes "���ЂƂȂ鐅�B";
		mes "���̗x�苶���g��������";
		mes "�Đ��Ɣj����i��΁B";
		next;
		mes "[���K��]";
		mes "���ꂪ���R���B";
		mes "���������h��Ȃ���΂Ȃ�Ȃ����݁B";
		mes "�����Ă��̑S�Ă̂��̂̏�ɂ�";
		next;
		mes "[���K��]";
		mes "^3434FF���z��^000000";
		next;
		mes "[���K��]";
		mes "^3434FF����^000000";
		next;
		mes "[���K��]";
		mes "^3434FF�������肪^000000";
		next;
		mes "[���K��]";
		mes "���̖����̏j����";
		mes "��������";
		mes "���E��";
		mes "��n��";
		mes "��t�ɖ������Ă���̂��B";
		next;
		mes "[���K��]";
		mes "����ł́A";
		mes "�N���������̐���ֈē����悤�B";
		mes "��u�̑I���ŉ^�����x�������Ă���";
		mes "�������̐��悾�B";
		next;
		mes "[���K��]";
		mes "�N�͂����Ō��āA�����āA���������Ƃ�";
		mes "���Ɍ��������ł����B";
		mes "�c�c�c�c�c�c";
		mes "�������ł�����A";
		mes "�܂����̌��֗����܂��B";
		delitem 996,1;
		delitem 997,1;
		delitem 995,1;
		delitem 994,1;
		set CHANGE_SG,3;
		close;
	case 3:
		mes "[���K��]";
		mes "�����͂ł������ˁB";
		mes "���z�ƌ��Ɛ��̐�m�����̐����";
		mes "�N�͍s�����ƂɂȂ�B";
		next;
		if(select("�����A�҂��Ă��������I","���ł��ǂ���")==1) {
			mes "[���K��]";
			mes "���������B";
			mes "�������ł�����ĂԂƂ����B";
			close;
		}
		mes "[���K��]";
		mes "�悵�A�s�����܂��B";
		mes "�����ɂ͕ʂ̒S���҂����邾�낤�B";
		mes "�S�Ă��I�������A";
		mes "���̌��֖߂��Ă��邱�Ƃ�Y�ꂸ�ɁB";
		close2;
		savepoint "comodo.gat",180,151;
		warp "job_star.gat",34,12;
		end;
	default:
		mes "[���K��]";
		mes "�܂��R������鎞�ł͂Ȃ��B";
		mes "������x����ɍs���Ȃ����B";
		close2;
		warp "job_star.gat",34,12;
		end;
	case 6:
		mes "[���K��]";
		mes "��Ɍ��O��������ȁB";
		mes "�������A������";
		mes "�������g�œ����Ȃ���΂Ȃ�Ȃ��B";
		mes "�[���ł��铚��������������";
		mes "�܂����邪�����B";
		close;
	case 7:
		mes "[���K��]";
		mes "���q�����̘b�͂��߂ɂȂ������H";
		mes "����̗l�Ȏ��͏�ɂ��鎖�ŁA";
		mes "��֖̊�̂悤�Ȃ��̂��B";
		mes "�������A�����ʂ���";
		mes "�����̐S���т���悤��";
		mes "�����ق����������B";
		next;
		mes "[���K��]";
		mes "�s�������҂��Ă���B";
		mes "���̕����ɍs�����悤�B";
		mes "�N�͌��āA�����āA���������Ƃ�";
		mes "�S�Ď��Ɍ�����悤��";
		mes "�S�ɍ��݂Ȃ����B";
		close2;
		warp "job_star.gat",100,13;
		end;
	case 10:
		mes "[���K��]";
		mes "�`�q�̂��������B";
		mes "����Ȃ��̂��������ȁB";
		mes "�N����J���Ă���悤���B";
		next;
		mes "[���K��]";
		mes "���̕����ɍs�����H";
		mes "�����Ȃ玄�������������Ă����悤�B";
		next;
		if(select("���肢���܂�","�܂������ł�")==2) {
			mes "[���K��]";
			mes "�������I���΂܂����Ȃ����B";
			close;
		}
		mes "[���K��]";
		mes "���������܂�";
		mes "���̌��ɗ��鎖�ɂȂ�͂����B";
		close2;
		warp "job_star.gat",166,29;
		end;
	case 12:
		if(SkillPoint) {
			mes "[���K��]";
			mes "�X�L���|�C���g���]���Ă���ȁB";
			mes "�N�͂܂��S�̒��ɂ��߂炢������悤���B";
			next;
			mes "[���K��]";
			mes "�K�������X�L���|�C���g���g���Ȃ����B";
			mes "�������Ȃ���΁A";
			mes "�����ɂȂ邱�Ƃ͂ł��Ȃ��B";
			close;
		}
		mes "[���K��]";
		mes "�悭�߂��Ă����ȁB";
		mes "�ڂ��������Ƃ悭�Ȃ��Ă��邼�B";
		mes "�������āA���������Ă����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���z�ƌ��Ɛ������݂��邱�Ƃ�";
		mes "�����܂����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���z�ƌ��Ɛ��̒g�����������܂����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���z�ƌ��Ɛ����^����";
		mes "���炩���������܂����B";
		next;
		mes "[���K��]";
		mes "�����āH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̎U�X�ƎU��΂����߂��݂�";
		mes "�����܂����B";
		mes "���̗₽���{��������܂����B";
		mes "���z�͍Đ��Ɣj��̉��g�ł����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���z�ƌ��Ɛ��̓{���";
		mes "���ׂĂ̂��̂���蕪����";
		mes "�������Ăяo���܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������A���z�ƌ��Ɛ���F�ɂ����";
		mes "�����̏j����^�����܂����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c���̏����ȑ̂�";
		mes "�F���̒��ɓ��X�Ƒ��݂��Ă��܂����B";
		next;
		mes "[���K��]";
		mes "���h�ɂȂ����ȁB";
		mes "�N�͂���";
		mes "���z�ƌ��Ɛ��̐�m���B";
		next;
		unequip;
		jobchange Job_Star;
		set CHANGE_SG,0;
		mes "[���K��]";
		mes "�������̑S�����A�S��芽�}���悤�B";
		next;
		mes "[���K��]";
		mes "�I���͐T�d�ɂ���悤�ɁB";
		mes "�����������͂��̑I���ɂ����";
		mes "�ꐶ�̉^�������߂���B";
		mes "�����āA���x���������̂�Y���ȁB";
		next;
		mes "[���K��]";
		mes "^3434FF���z�͋�������ῂ������o���A";
		mes "���͊���ɂ��̋P���𑝂��A";
		mes "���͌ܓ��ڂɖ��T������U��T���B^000000";
		next;
		mes "[���K��]";
		mes "�����N�ɖ]�ނ��Ƃ͂��ꂾ�����B";
		mes "�Ȍ�̐����͌N�̎��R�B";
		mes "�����������́A���z�ƌ��Ɛ����������";
		mes "���̋�̉��ɂ���Ƃ����̂�";
		mes "�Y��Ȃ��悤�ɁB";
		close;
	}
}

//==========================================
// ����
//------------------------------------------

job_star.gat,29,33,0	script	�^��	59,{
	if(Job != Job_Taekwon) {
		mes "[�^��]";
		mes "�]�E�������ז����Ȃ��ł��������ˁB";
		mes "���ɖ߂�܂����H";
		next;
		if(select("���ɖ߂�","������")==2) {
			mes "[�^��]";
			mes "�����ł����B";
			close;
		}
		mes "[�^��]";
		mes "������܂����B";
		mes "���ɑ����Ă��������܂��B";
		close2;
		warp "payon.gat",164,58;
		end;
	}
	switch(CHANGE_SG) {
	case 3:
		mes "[�^��]";
		mes "���K���搶�ɑ���ꂽ���ł��ˁB";
		mes "���z�̕����ɂ悤�����B";
		mes "���͂����ł��Ȃ���";
		mes "����`��������悤�Ɍ����Ă��܂��B";
		next;
		mes "[�^��]";
		mes "����ł͎n�߂܂��ˁB";
		mes "�����Ȃ��̖ڂ̑O�ɂ͉�������܂����H";
		next;
		switch(select("���z","��","��","������Ȃ�")) {
		case 1:
			mes "[�^��]";
			mes "�����ł��B����͑��z�ł��B";
			mes "�����ē��X�Ƒ��z�ƌ���������";
			mes "�����������z�Ȃ̂ł��B";
			set '@test,'@test+1;
			break;
		case 2:
			mes "[�^��]";
			mes "���ł����c�c";
			mes "�����͑��z�̕������ƌ������ł��傤�B";
			break;
		case 3:
			mes "[�^��]";
			mes "���ł����B";
			mes "�m���ɑ��z���F���ɑ��݂���";
			mes "�����̒��̐��ł��ˁB";
			break;
		case 4:
			mes "[�^��]";
			mes "�����ł����c�c";
			mes "����������ƐS���J����";
			mes "�z���͂�L���ɂ��������ǂ��ł��ˁB";
			break;
		}
		next;
		mes "[�^��]";
		mes "���؂͑��z�̌����󂯂�";
		mes "���������܂��B";
		mes "���Ȃ��͑��z���牽�����炢�܂����H";
		next;
		switch(select("������","���y","�j��","���������Ȃ�")) {
		case 1:
			mes "[�^��]";
			mes "�����ł��B";
			mes "�������͂��̖����̌�����";
			mes "�g�����������^�����Ă��܂��B";
			set '@test,'@test+1;
			break;
		case 2:
			mes "[�^��]";
			mes "�����ł��B";
			mes "�������͖��邢���̒��ɂ��鎞�A";
			mes "�S�̕s����@������A�����𓾂܂��B";
			set '@test,'@test+1;
			break;
		case 3:
			mes "[�^��]";
			mes "�����ł��B";
			mes "���؂����z�̏j���Ő��������悤��";
			mes "���������j����^�����Ă��܂��B";
			set '@test,'@test+1;
			break;
		case 4:
			mes "[�^��]";
			mes "���ł͂Ȃ�";
			mes "���̒��ōl���Č��Ă��������B";
			mes "���Ȃ��ɂ��ԈႢ�Ȃ�";
			mes "���z����󂯂�����������͂��ł��B";
			break;
		}
		next;
		mes "[�^��]";
		mes "����ȉ̂�����܂��B";
		mes "^3434FF���z�͋�������ῂ������o���A";
		mes "���͊���ɂ��̋P���𑝂��A";
		mes "���͌ܓ��ڂɖ��T������U��T���B^000000";
		next;
		mes "[�^��]";
		mes "���Ȃ��͑��z�̏ꏊ�������ɁA";
		mes "���z�̑������a�ɗ^�����B";
		mes "���Ȃ��͌��̏ꏊ�����n�ɁA";
		mes "���̑��������j�ɗ^�����B";
		mes "���Ȃ��͐��̏ꏊ���Ï�ɁA";
		mes "���̑����������R�m�ɗ^���܂����B";
		next;
		mes "[�^��]";
		mes "�N����Ԗ��邭�P�����Ƃ��ł������";
		mes "�ǂ̎��ł����H";
		next;
		if(select("2���A���n�A�����R�m","4���A�����A�a","10���A�����A�����R�m","5���A���n�A���j")==2)
			set '@test,'@test+1;
		mes "[�^��]";
		mes "�ӂށA���̈ʂŏ\���ł��ˁB";
		mes "���̎O�̎����";
		mes "���������E���邱�Ƃ͂���܂���B";
		mes "���S���Ă��������B";
		next;
		if('@test >= 2) {
			mes "[�^��]";
			mes "���Ȃ��́c�c";
			mes "���z�̌���";
			mes "����������n�܂����Ƃ������Ƃ�";
			mes "�M���܂����H";
			next;
			mes "[�^��]";
			mes "���z�̌���";
			mes "�������̎�Ŏ��Ȃ���΂Ȃ�Ȃ�";
			mes "�Ƃ������Ƃ�M���܂����H";
			next;
			mes "[�^��]";
			mes "���͂��Ȃ��̎���M���܂��B";
			mes "���z�̐�m�ɂȂ���";
			mes "���z�̒g�������A���炩�����A";
			mes "�j�������̗���Ŏ󂯎~�߂��邱�Ƃ��B";
			next;
			mes "[�^��]";
			mes "����ł́A���Ȃ���";
			mes "�u���̕����v��";
			mes "�����Ă��������܂��傤�B";
			set CHANGE_SG,5;
			close2;
			warp "job_star.gat",100,13;
			end;
		}
		else {
			mes "[�^��]";
			mes "���Ȃ��́c�c";
			mes "���z������̂܂܂�";
			mes "���R�̑��݂���";
			mes "���ߕt���Ȃ��ł��������B";
			next;
			mes "[�^��]";
			mes "���Ȃ��̐��E�ŁA";
			mes "���Ȃ��ƈꏏ�Ɍċz���A";
			mes "���ɐ����čs��";
			mes "���e�̂悤�ȑ��݂Ȃ̂ł��B";
			next;
			mes "[�^��]";
			mes "���Ȃ��͂�������";
			mes "���z�𗝉�����K�v������܂��B";
			mes "�����ɍ�����";
			mes "���z�̈̑傳�������Ă��������B";
			set CHANGE_SG,4;
			close;
		}
	case 4:
		if(rand(5)) {
			mes "[�^��]";
			mes "�Â��ɐS�𒾂߁c�c";
			mes "�ڂ��ނ��āc�c";
			mes "���X�ɋߕt��";
			mes "���z�̒g�����������Ă��������B";
			next;
			mes "[�^��]";
			mes "���̘b�͑��z�𑶕���";
			mes "�����ꂽ��ɑ����邱�Ƃɂ��܂��B";
			close;
		}
		mes "[�^��]";
		mes "���z���ǂ�ȑ��݂Ȃ̂�";
		mes "������܂������H";
		mes "���ŗ����������";
		mes "���Ŋ�������������Əd�v�ł��B";
		next;
		mes "[�^��]";
		mes "�����l�ł����B";
		mes "�\���ɗ������Ă���ƐM����";
		mes "���̕����֑����Ă��������܂��B";
		set @star_test,0;
		set CHANGE_SG,5;
		close2;
		warp "job_star.gat",100,13;
		end;
	case 5:
	case 6:
		mes "[�^��]";
		mes "�ǂ����Ă܂�";
		mes "�����ɂ���̂ł����H";
		mes "���̕����ɑ����Ă��������܂��B";
		close2;
		warp "job_star.gat",100,13;
		end;
	default:
		mes "[�^��]";
		mes "���z�̕������C�ɓ���܂������H";
		mes "����Ƃ��A���ɖ������̂ł����H";
		mes "���Ȃ��͍��A�u���̕����v��";
		mes "���Ȃ���΂Ȃ�܂���B";
		next;
		mes "[�^��]";
		mes "���̕����ɑ����Ă��������܂��B";
		close2;
		warp "job_star.gat",166,29;
		end;
	}
}

job_star.gat,95,33,0	script	�s����	106,{
	if(Job != Job_Taekwon) {
		mes "[�s����]";
		mes "�]�E�����̎ז��ɂȂ�B";
		mes "�ق��Ă����Ȃ��Ȃ瑺�ɋA��B";
		mes "�������߂邩�H";
		next;
		if(select("���ɖ߂�","������")==2) {
			mes "[�s����]";
			mes "�c�c�c�c�c�c";
			mes "�������c�c�ז�������Ȃ�B";
			close;
		}
		mes "[�s����]";
		mes "���ɑ����Ă��B";
		close2;
		warp "payon.gat",164,58;
		end;
	}
	switch(CHANGE_SG) {
	case 5:
		mes "[�s����]";
		mes "�͂₭���Ȃ����B";
		mes "���̉e�ɂȂ�҂�B";
		mes "�����炱�̃s���������������B";
		next;
		mes "[�s����]";
		mes "�₨���B";
		mes "�������ɕK�v�Ȍ��͂ǂ̂悤�Ȍ����H";
		mes "���O�̊肤���͂ǂ̂悤�Ȍ����H";
		next;
		switch(select("�Ԃ���","����","���F����","�c�c�H")) {
		case 1:
			mes "[�s����]";
			mes "�Ԃ������Ɓc�c";
			mes "������������肤���H";
			mes "���C�͉������������ǂ��B";
			break;
		case 2:
			mes "[�s����]";
			mes "���Â��ɐ݂��������錎��";
			mes "�S�𗎂�������";
			mes "��ÂȎ�����T���Ă����B";
			mes "�ǂ��I�����B";
			set '@test,'@test+1;
			break;
		case 3:
			mes "[�s����]";
			mes "���ɋP�����́A�F�ɖL����񑩂���B";
			mes "����͖�̎�l�����L�����������B";
			mes "�����Ȃ��I�����B";
			set '@test,'@test+1;
			break;
		case 4:
			mes "[�s����]";
			mes "�����̈ӌ��������Ƃ�";
			mes "�ƂĂ��d�v�Ȏ����B";
			mes "�����Ǝ��M�����K�v������B";
			mes "�܂����c�c�����������H";
			break;
		}
		next;
		mes "[�s����]";
		mes "���O�����̉e�ɂȂ�";
		mes "���̗��R�͉����H";
		next;
		switch(select("���`���H","���ȏC��","���R�ی�","���Q")) {
		case 1:
			mes "[�s����]";
			mes "���p�Ɨ͂Ő��`�����H����̂��H";
			mes "�����̐M�O���т����߂ɂ�";
			mes "�͂��K�v���Ƃ������Ƃ�";
			mes "�킩���Ă���ȁB";
			set '@test,'@test+1;
			break;
		case 2:
			mes "[�s����]";
			mes "�������g�����߂邱�Ƃ�";
			mes "�ƂĂ��d�v�Ȏ����B";
			mes "�������A���̏C��������̂��Ƃ���";
			mes "���̗��R�ƖڕW�͖Y��Ă͂����Ȃ��B";
			set '@test,'@test+1;
			break;
		case 3:
			mes "[�s����]";
			mes "�c�c�c�c�c�c�ܘ_�A";
			mes "���R��ی삷�邱�Ƃ�";
			mes "�������̎g�����B";
			mes "�������A���̉e�ƂȂ炸�Ƃ�";
			mes "���R�ی�͂ł��鎖���B";
			break;
		case 4:
			mes "[�s����]";
			mes "�����͐Â��ȓ{������ɂ���B";
			mes "�₽���΂݂̌�A";
			mes "�悭�b����ꂽ�n��U�邤�B";
			mes "�܂�Œ��񂾌΂̂悤�Ɂc�c�c�c";
			mes "�����c�c";
			next;
			mes "[�s����]";
			mes "���Q���I������A";
			mes "���O�͉����x���ɐ����čs���H";
			mes "�ӖړI�ȕ��Q���A";
			mes "���a���w�΂Ȃ���΂Ȃ�Ȃ��悤���ȁB";
			break;
		}
		next;
		mes "[�s����]";
		mes "���̉̂��o���Ă��邩�H";
		mes "^3434FF���z�͋�������ῂ������o���A";
		mes "���͊���ɂ��̋P���𑝂��A";
		mes "���͌ܓ��ڂɖ��T������U��T���B^000000";
		next;
		mes "[�s����]";
		mes "���O�͑��z�̏ꏊ�������ɁA";
		mes "���z�̑������a�ɗ^�����B";
		mes "���O�͌��̏ꏊ�����n�ɁA";
		mes "���̑��������j�ɗ^�����B";
		mes "���O�͐��̏ꏊ���Ï�ɁA";
		mes "���̑����������R�m�ɗ^�����B";
		next;
		mes "[�s����]";
		mes "���O�����̉e�Ƃ���";
		mes "��ԋP�����͂����H";
		next;
		if(select("2���A���n�A�����R�m","4���A�����A�a","10���A�����A�����R�m","5���A���n�A���j")==4)
			set '@test,'@test+1;
		mes "[�s����]";
		mes "�ȒP�Ȏ���͂��̈ʂɂ���B";
		next;
		if('@test >= 2) {
			mes "[�s����]";
			mes "���O�́c�c";
			mes "���̉e���ǂ�ȑ��݂Ȃ̂�";
			mes "�Â��ŕ��Â��Ȍ����肪";
			mes "�����Ӗ����Ă���̂�";
			mes "�������Ȃ���΂Ȃ�Ȃ��B";
			next;
			mes "[�s����]";
			mes "���z�̔M����M��";
			mes "���O�̐S���Ă��s�����Ȃ��悤";
			mes "���݂���̂��₽�������B";
			mes "���O�͂��̂悤��";
			mes "���̉e�ɂȂ�Ȃ���΂Ȃ�Ȃ��B";
			next;
			mes "[�s����]";
			mes "���̉e�ƂȂ�";
			mes "�F�̓{����󂯓���A";
			mes "���̐�m�Ƃ���";
			mes "�ނ�̑����";
			mes "���Ȃ���΂Ȃ�Ȃ��B";
			next;
			mes "[�s����]";
			mes "���͓��������x������Ȃ��B";
			mes "����͑��z�̐�m���A";
			mes "���̉e���A���̗܂��������B";
			next;
			mes "[�s����]";
			mes "�l�͒N�����A";
			mes "��ɑI���̊�H�ɗ����Ă���B";
			mes "�����āA�U��Ԃ鎖���ł��Ȃ��I����";
			mes "�ꐶ�������Ȃ���΂Ȃ�Ȃ��̂�";
			mes "�܂��Ɏ������A�������B";
			next;
			mes "[�s����]";
			mes "���͂��O��������Ȃ�����";
			mes "�i�ނ��Ƃ�����Ă���B";
			mes "����ł́A���̕����ɍs��";
			mes "���i��^���悤�B";
			set CHANGE_SG,8;
			close2;
			warp "job_star.gat",166,29;
			end;
		}
		else {
			mes "[�s����]";
			mes "���O�́c�c";
			mes "�������肪�Ӗ����邱�Ƃ�";
			mes "�����Ɨ������Ȃ���΂Ȃ�Ȃ��B";
			next;
			mes "[�s����]";
			mes "�Z���I�ȐS�ł́A���̑���Ƃ���";
			mes "�������Ƃ͂ł��Ȃ��B";
			mes "���O�͔E�ϗ͂���ĂȂ���΂Ȃ炸�A";
			mes "��ɂ��̏�ɗ��܂�镽��S��";
			mes "�{��Ȃ���΂Ȃ�Ȃ��B";
			next;
			mes "[�s����]";
			mes "���͓��������x������Ȃ��B";
			mes "����͑��z�̐�m���A";
			mes "���̉e���A���̗܂��������B";
			next;
			mes "[�s����]";
			mes "�l�͒N�����A";
			mes "��ɑI���̊�H�ɗ����Ă���B";
			mes "�����āA�U��Ԃ鎖���ł��Ȃ��I����";
			mes "�ꐶ�������Ȃ���΂Ȃ�Ȃ��̂�";
			mes "�܂��Ɏ������A�������B";
			next;
			mes "[�s����]";
			mes "����ł�������Ȃ�������ނƂ����Ȃ�";
			mes "���̏؋������Ɍ����Ȃ����B";
			set CHANGE_SG,6;
			close2;
			warp "payon.gat",164,58;
			end;
		}
	case 7:
		mes "[�s����]";
		mes "�c�c�c�c�c�c�c�c�ӂӁB";
		mes "�����҂������тꂽ���B";
		mes "�����A���Ă���Ȃ�������A";
		mes "���O�͈ꐶ������Ȃ���";
		mes "�����Ă��������������B";
		next;
		mes "[�s����]";
		mes "������Ȃ��l���ɂ́u�����v���K�v���B";
		mes "�u�E�ϗ́v�A�u��e�́v�A";
		mes "�����āA���̑S�Ă��x���邱�Ƃ��ł���";
		mes "�u�����v�ƒ���̂��߂́u�����v�B";
		next;
		mes "[�s����]";
		mes "�͂Ɏ������߂����O��";
		mes "�����̐S��b���A�t�ɗ͂�";
		mes "�x�z���Ȃ���΂Ȃ�Ȃ��B";
		mes "�����̐M�O���Ȃ�����";
		mes "�l�Ԃ͓��X�Ƌ�����Ȃ���";
		mes "�����Ă����ׂ��Ȃ̂��B";
		next;
		mes "[�s����]";
		mes "������Ȃ��l���B";
		mes "�����i�ނ̂��܂��Ɏ������������I";
		mes "�|��Ă��܂��N���オ�ꂽ���O��";
		mes "���̕����֍s��";
		mes "���i��^���悤�I";
		set CHANGE_SG,8;
		close2;
		warp "payon.gat",164,58;
		end;
	default:
		mes "[�s����]";
		mes "�Ȃ������Ɏc���Ă���H";
		mes "�������ł��C�ɓ��������H";
		mes "�킩���ł��Ȃ����A";
		mes "���O�͌����ɂȂ邽�߂̎�����";
		mes "�󂯂Ă���̂ł͂Ȃ��̂��H";
		next;
		mes "[�s����]";
		mes "���̕����ɑ����Ă��B";
		close2;
		warp "job_star.gat",166,29;
		end;
	}
}

job_star.gat,161,33,0	script	�`�q	77,{
	if(Job != Job_Taekwon) {
		mes "[�`�q]";
		mes "�������肪�������ł��傤�H";
		mes "���֖߂�܂����H";
		next;
		if(select("���ɖ߂�","������")==2) {
			mes "[�`�q]";
			mes "�����ł����B";
			close;
		}
		mes "[�`�q]";
		mes "������܂����B";
		mes "���֖߂��Ă����܂��B";
		close2;
		warp "payon.gat",164,58;
		end;
	}
	switch(CHANGE_SG) {
	case 8:
		mes "[�`�q]";
		mes "�ǂ��ł����H";
		mes "�������肪�{����";
		mes "���ꂢ����Ȃ��ł����H";
		next;
		mes "[�`�q]";
		mes "�܂�ō����J�[�e���ɎU��΂�";
		mes "�����̗܂̗l�Ɏv���Ă��܂��B";
		set CHANGE_SG,9;
		close;
	case 9:
		if(rand(3)) {
			mes "[�`�q]";
			mes "�c�c�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c";
			next;
			mes "-�ޏ��͋�̐�����ڂ𗣂��Ȃ�-";
			close;
		}
		mes "[�`�q]";
		mes "�n��ł��̐���";
		mes "��ɂ��邱�Ƃ��ł��܂����H";
		mes "�U�点�΂ق���̂悤�ɏ����Ă��܂�";
		mes "���̐��X����ɂ��邱�Ƃ��ł��܂����H";
		set CHANGE_SG,10;
		close;
	case 10:
		if(countitem(1000) < 1 || countitem(1001) < 1) {
			mes "[�`�q]";
			mes "���̂�����c�c�����Đ��̕��B";
			mes "�����ł͎�ɓ���邱�Ƃ��ł��܂���B";
			mes "��x���R���Ď�ɓ���ė��Ă��������B";
			close2;
			warp "payon.gat",164,58;
			end;
		}
		mes "[�`�q]";
		mes "���҂������܂����B";
		mes "�l�X�͂��̂悤�Ȑ���";
		mes "�S��b���Ă܂��ˁB";
		next;
		mes "[�`�q]";
		mes "���a�ɓ��X��������l�Ԃ́A";
		mes "���̗͂Ől���A�����A������";
		mes "��낤�Ƃ��܂��B";
		next;
		mes "[�`�q]";
		mes "�����āA�S�ɂȂ�������";
		mes "������D����邱�Ƃ�";
		mes "���̐�������邱�ƂɂȂ�܂��B";
		next;
		mes "[�`�q]";
		mes "����͔߂������ł��B";
		mes "�������A���ꂪ�����Ƃ�������";
		mes "���ŗ����ł��܂��ˁH";
		next;
		mes "[�`�q]";
		mes "�V�̐�𗬂�����";
		mes "�������Ǝv���܂��񂩁H";
		mes "�������A����͏����Ă���������";
		mes "��Ōq�������Đ��܂ꂽ���̗܂ł��B";
		next;
		mes "[�`�q]";
		mes "���z�̋@�^�𓾂�";
		mes "���̋@�^�𓾂�";
		mes "���̋@�^�𓾂悤��";
		mes "���Ă��������c�c";
		next;
		mes "[�`�q]";
		mes "����ł͂��������܂��B";
		mes "���Ȃ��͒N�̗܂̑����";
		mes "���𗬂����Ǝv���܂����H";
		delitem 1000,1;
		delitem 1001,1;
		set CHANGE_SG,11;
		close;
	case 11:
		mes "[�`�q]";
		mes "�l���Ă݂܂������H";
		mes "�������ł͂Ȃ������͂��ł��B";
		mes "���𗬂����҂ɂ́A";
		mes "��ɗ܂����ɂ��邱�Ƃ�";
		mes "�킩���Ă��邩�����Ă݂������ł��B";
		next;
		mes "[�`�q]";
		mes "^3434FF���z�͋�������ῂ������o���A";
		mes "���͊���ɂ��̋P���𑝂��A";
		mes "���͌ܓ��ڂɖ��T������U��T���B^000000";
		mes "���͕̉̂����Ă��܂��ˁH";
		next;
		mes "[�`�q]";
		mes "���Ȃ��͑��z�̏ꏊ��������";
		mes "���z�̑������a�ɗ^�����B";
		mes "���Ȃ��͌��̏ꏊ�����n��";
		mes "���̑��������j�ɗ^�����B";
		mes "���Ȃ��͐��̏ꏊ���Ï��";
		mes "���̑����������R�m�ɗ^�����B";
		next;
		mes "[�`�q]";
		mes "���Ȃ������Ԑ��̖����肪���邭";
		mes "�P�����͉����ł��邩";
		mes "�������ł����H";
		next;
		if(select("5���A�Ï�A�a","10���A�����A�a","25���A�Ï�A�����R�m","10���A�����A�����R�m")==3) {
			mes "[�`�q]";
			mes "�킩���Ă���悤�ł��ˁB";
			mes "���͉F���������I�ɉ��A";
			mes "��������K�˂ɂ��܂��B";
			mes "���z�ɗ����������A���炪";
			mes "��̑��z�ɂȂ�̂������̓��B";
			next;
			mes "[�`�q]";
			mes "���ƈ�ɂȂ�A";
			mes "�e�ƂȂ�̂���̓��B";
			mes "�������玄������K�˂�̂��ܓ��ځB";
			next;
			mes "[�`�q]";
			mes "�ܓ��Ɉ�x�K��鐯�������";
			mes "�������ɏj���������Ă���܂��B";
			mes "���̓��A���̏ꏊ�A";
			mes "�����Đ��̑�����������ꂽ���݁B";
			next;
			mes "[�`�q]";
			mes "���̓��������A";
			mes "���Ȃ�����ԋ����P������ł��B";
			mes "�����͑��z�ƌ��Ɛ���";
			mes "����ƒg�����Ƒ�����";
			mes "�����Ɨ������Ȃ���΂Ȃ�܂���B";
			next;
			mes "[�`�q]";
			mes "��قǂ̉̂ɂ�";
			mes "���z�ƌ��Ɛ��Ǝ������̌�����";
			mes "�F�ɂ������Ă���̂ł��B";
			mes "�������ƍl���āA";
			mes "�����Ӗ����Ă��邩�������Ă��������B";
		}
		else {
			mes "[�`�q]";
			mes "�����͑��z�ƌ��Ɛ���";
			mes "����ƒg�����Ƒ�����";
			mes "�����Ɨ������Ȃ���΂Ȃ�܂���B";
			next;
			mes "[�`�q]";
			mes "���z�ƌ��Ɛ��Ǝ������̌�����";
			mes "�F�ɂ������Ă���̂ł��B";
			mes "�������ƍl���āA";
			mes "�����Ӗ����Ă��邩�������Ă��������B";
		}
		next;
		mes "[�`�q]";
		mes "�����ɂȂ��Ă��A�Y�ꂸ��";
		mes "���̈Ӗ���U��Ԃ�";
		mes "������Ȃ��I����";
		mes "�I�΂Ȃ���΂Ȃ�܂���B";
		next;
		mes "[�`�q]";
		mes "�\���ɐ�������������A";
		mes "�������Ă���Ǝv�����̂Ȃ�A";
		mes "���K���搶�̏��܂�";
		mes "�����肵�܂��B";
		set CHANGE_SG,12;
		close;
	case 12:
		mes "[�`�q]";
		mes "�R������܂����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�`�q]";
			mes "��������ŐS�������ς��ɖ������܂�";
			mes "������ł������ɂ��ėǂ��̂ł���B";
			mes "�̂т₩�ɁA�������ƁA";
			mes "�����Ɍ�����Ȃ��悤�Ɂc�c�c�c";
			close;
		}
		mes "[�`�q]";
		mes "�߂��̑��ɑ����Ă����܂��B";
		close2;
		warp "payon.gat",164,58;
		end;
	}
}