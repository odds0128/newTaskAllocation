package root;

public interface EnvironmentalConstants {
     int AGENT_NUM = 500;
     int INITIAL_LEADER_NUM = 100;
     int MAX_X = 51;
     int MAX_Y = 51;
     int MAX_DELAY = 5;

     int RESOURCE_TYPES = 3;

    // 各リソースの最大値と最小値
     int AGENT_MAX_RESOURCE = 5;
     int AGENT_MIN_RESOURCE = 0;

     int TASK_MAX_RESOURCE = 10;
     int TASK_MIN_RESOURCE = 5;

    // 各初期値
     double INITIAL_E_LEADER = 0.5;
     double INITIAL_E_MEMBER = 0.5;

     double INITIAL_DE_LEADER = 0.5;
     double INITIAL_DE_MEMBER = 0.5;

    enum PhasesLeader {
        act1,
        act2,
    }

    enum RoleName {
        leader,
        member,
    }

    enum PhasesMember {
        act1,
        act2,
        act3,
    }

    enum StrategyName {
        StrategyX,
    }

}